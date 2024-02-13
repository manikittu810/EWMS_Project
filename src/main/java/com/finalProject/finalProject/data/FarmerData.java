package com.finalProject.finalProject.data;

import jakarta.persistence.*;

@Entity
@Table(name="farmers")
public class FarmerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String farmerName;
    @Column(name="area")
    private int farmerArea;

    public FarmerData(String farmerName, int farmerArea) {
        this.id = id;
        this.farmerName = farmerName;
        this.farmerArea = farmerArea;
    }

    public FarmerData() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public int getFarmerArea() {
        return farmerArea;
    }

    public void setFarmerArea(int farmerArea) {
        this.farmerArea = farmerArea;
    }

    @Override
    public String toString() {
        return "FarmerData{" +
                "id=" + id +
                ", farmerName='" + farmerName + '\'' +
                ", farmerArea=" + farmerArea +
                '}';
    }
}
