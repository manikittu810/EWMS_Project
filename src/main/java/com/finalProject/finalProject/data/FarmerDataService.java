package com.finalProject.finalProject.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerDataService {
    @Autowired
    private FarmerDataRepository repository;

    public FarmerData getFarmerById(Long id) {
        return repository
                .findById((long) Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("Farmer not found"));
    }
    public List<FarmerData> getAllFarmersSortedByName() {
        return repository.findAll(Sort.by("farmerName"));
    }
    //for put request
    public FarmerData updateFarmer(Long id, FarmerData farmerData) {
        FarmerData existingFarmer = getFarmerById(id);
        existingFarmer.setFarmerName(farmerData.getFarmerName());
        existingFarmer.setFarmerArea(farmerData.getFarmerArea());
        existingFarmer.setEmail(farmerData.getEmail());
        existingFarmer.setPhone(farmerData.getPhone());
        existingFarmer.setCropCount(farmerData.getCropCount());
        existingFarmer.setRegion(farmerData.getRegion());
        existingFarmer.setWaterResource(farmerData.getWaterResource());
        return repository.save(existingFarmer);
    }

    //saving farmer data for a post request?
    public FarmerData saveFarmerData(FarmerData farmerData) {
        return repository.save(farmerData);
    }

    //get all farmers
    public List<FarmerData> getAllFarmers() {
        return repository.findAll();
    }


//deleting a farmer
    public void deleteFarmer(Long id) {
        repository.deleteById((long) Math.toIntExact(id));
    }

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    public FarmerData registerFarmer(FarmerData farmerData){
//        String hashedPassword = passwordEncoder.encode(farmerData.getPassword());
//        return repository.save(farmerData);
//    }


}