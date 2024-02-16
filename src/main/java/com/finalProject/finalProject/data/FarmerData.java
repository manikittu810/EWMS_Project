package com.finalProject.finalProject.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

@Entity
@Table(name="farmers")
public class FarmerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Farmer_name")
    private String farmerName;
    @Column(name="farmer_area")
    @Max(value = 10, message = "Land area should not be greater than 10")
    private int farmerArea;
    @Column(name = "NCPY")
    @Max(value = 3, message = "cropCount should not be greater than 3")
    private int cropCount;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Long phone;

    public enum WaterResource{
        WELL,BOREWELL,RIVER,LAKE,POND,RAINWATER,NONE;
    }
    @Enumerated(EnumType.STRING)
    @Column(name="water_resource")
    private WaterResource waterResource;

    @Column(name = "region")
    private String region;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getCropCount() {
        return cropCount;
    }

    public void setCropCount(int cropCount) {
        this.cropCount = cropCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public WaterResource getWaterResource() {
        return waterResource;
    }

    public void setWaterResource(WaterResource waterResource) {
        this.waterResource = waterResource;
    }

    @Override
    public String toString() {
        return "FarmerData{" +
                "id=" + id +
                ", farmerName='" + farmerName + '\'' +
                ", farmerArea=" + farmerArea +
                ", cropCount=" + cropCount +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", Region='" + region + '\'' +
                ", waterResource=" + waterResource +
                '}';
    }

}
