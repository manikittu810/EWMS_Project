package com.finalProject.finalProject.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FarmerData {

    private String farmerName;
    private Double farmerArea;
    @Id
    private Long id;

    public FarmerData() {

    }

    public Double getFarmerArea() {
        return farmerArea;
    }

    public void setFarmerArea(Double farmerArea) {
        this.farmerArea = farmerArea;
    }


    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public FarmerData(String farmerName, Double farmerArea) {
        super();
        this.farmerName = farmerName;
        this.farmerArea = farmerArea;
    }
    @Override
    public String toString() {
        return "FarmerData{" +
                "farmerName='" + farmerName + '\'' +
                ", farmerArea=" + farmerArea +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
