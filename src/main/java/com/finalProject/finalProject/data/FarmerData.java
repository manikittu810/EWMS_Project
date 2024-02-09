package com.finalProject.finalProject.data;

public class FarmerData {

    private String farmerName;
    private Double farmerArea;

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
}
