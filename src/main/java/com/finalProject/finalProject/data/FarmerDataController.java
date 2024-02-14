package com.finalProject.finalProject.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FarmerDataController {
    private final FarmerDataService farmerDataService;

    public FarmerDataController(FarmerDataService farmerDataService){
        this.farmerDataService=farmerDataService;
    }

    //get all farmers
    @GetMapping("/farmer-list")
    public List<FarmerData> getAllFarmers(FarmerData farmerData){
        return farmerDataService.getAllFarmers();
    }

    //Create
    @PostMapping("/farmer-list")
    public FarmerData saveFarmerData(@RequestBody FarmerData farmerData){
        return farmerDataService.saveFarmerData(farmerData);
    }



}