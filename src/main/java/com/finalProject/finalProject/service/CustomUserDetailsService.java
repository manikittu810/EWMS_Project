package com.finalProject.finalProject.service;

import com.finalProject.finalProject.data.FarmerData;
import com.finalProject.finalProject.data.FarmerDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private FarmerDataRepository farmerDataRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        FarmerData farmer = farmerDataRepository.findByFarmerName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with farmer name: " + username));

        // Assuming your FarmerData entity has a getPassword method to retrieve the user's hashed password
        return new User(farmer.getFarmerName(), farmer.getPassword(), new ArrayList<>());
    }
}
