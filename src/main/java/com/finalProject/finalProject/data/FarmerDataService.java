package com.finalProject.finalProject.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerDataService {
    @Autowired
    private FarmerDataRepository farmerDataRepository;

    public FarmerData getFarmerById(Long id) {
        return farmerDataRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Farmer not found"));
    }

    public FarmerData updateFarmer(Long id, FarmerData farmerData) {
        FarmerData existingFarmer = getFarmerById(id);
        existingFarmer.setFarmerName(farmerData.getFarmerName());
        existingFarmer.setFarmerArea(farmerData.getFarmerArea());
        return farmerDataRepository.save(existingFarmer);
    }

    public FarmerData saveFarmerData(FarmerData farmerData) {
        return farmerDataRepository.save(farmerData);
    }

    public List<FarmerData> getAllFarmers() {
        return farmerDataRepository.findAll();
    }

    public void deleteFarmer(Long id) {
        farmerDataRepository.deleteById(id);
    }
}