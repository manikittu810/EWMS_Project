package com.finalProject.finalProject.data;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FarmerDataController {
    private final FarmerDataService farmerDataService;

    public FarmerDataController(FarmerDataService farmerDataService){
        this.farmerDataService=farmerDataService;
    }

    //get all farmers (Retrieve)
    @GetMapping("/farmer-list")
    public List<FarmerData> getAllFarmers(FarmerData farmerData){
        return farmerDataService.getAllFarmers();
    }

    //Create
    @PostMapping("/farmer-list")
    public FarmerData saveFarmerData(@Valid @RequestBody FarmerData farmerData){
        return farmerDataService.saveFarmerData(farmerData);
    }

    //Delete
    @DeleteMapping("/farmer-list/{id}")
    public ResponseEntity<Void> deleteFarmer(@PathVariable Long id){
        farmerDataService.deleteFarmer(id);
        return ResponseEntity.ok().build();
    }

    // Update or Put
    @PutMapping("/farmer-list/{id}")
    public FarmerData saveFarmerData(@PathVariable Long id,@Valid @RequestBody FarmerData farmerData){
        return farmerDataService.updateFarmer(id,farmerData);
    }

    @GetMapping("/sorted-farmer-list")
    public ResponseEntity<List<FarmerData>> getAllFarmersSortedByName(){
        List<FarmerData> sortedFarmers = farmerDataService.getAllFarmersSortedByName();
        return ResponseEntity.ok(sortedFarmers);
    }

//    below is the endpoint for the front to fetch data . This helps to select the waterresource from the dropdown
    @GetMapping("/water-resources")
    public ResponseEntity<FarmerData.WaterResource[]> getWaterResource(){
        return ResponseEntity.ok(FarmerData.WaterResource.values());
    }

}