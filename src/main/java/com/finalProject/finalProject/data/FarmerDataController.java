package com.finalProject.finalProject.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/farmer-data")
public class FarmerDataController {
    @Autowired
    private FarmerDataService farmerDataService;

    @PostMapping("/farmer-data")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public FarmerData createFarmer(@RequestBody FarmerData farmerData) {
        return farmerDataService.saveFarmerData(farmerData);
    }

    @GetMapping("/{id}")
    public FarmerData getFarmerById(@PathVariable Long id) {
        return farmerDataService.getFarmerById(id);
    }

    @GetMapping
    public List<FarmerData> getAllFarmers() {
        return farmerDataService.getAllFarmers();
    }

    @PutMapping("/{id}")
    public FarmerData updateFarmer(@PathVariable Long id, @RequestBody FarmerData farmerData) {
        return farmerDataService.updateFarmer(id, farmerData);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmer(@PathVariable Long id) {
        farmerDataService.deleteFarmer(id);
    }
}