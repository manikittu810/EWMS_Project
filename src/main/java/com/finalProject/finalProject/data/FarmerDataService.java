package com.finalProject.finalProject.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerDataService {
    @Autowired
    private FarmerDataRepository repository;

    public FarmerData getFarmerById(Long id) {
        return repository
                .findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("Farmer not found"));
    }

    public FarmerData updateFarmer(Long id, FarmerData farmerData) {
        FarmerData existingFarmer = getFarmerById(id);
        existingFarmer.setFarmerName(farmerData.getFarmerName());
        existingFarmer.setFarmerArea(farmerData.getFarmerArea());
        return repository.save(existingFarmer);
    }

    public FarmerData saveFarmerData(FarmerData farmerData) {
        return repository.save(farmerData);
    }

    public List<FarmerData> getAllFarmers() {
        return repository.findAll();
    }

    public void deleteFarmer(Long id) {
        repository.deleteById(Math.toIntExact(id));
    }
}