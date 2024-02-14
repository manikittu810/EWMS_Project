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
    @Column(name="Land_area")
    private int farmerArea;
    @Column(name = "NCPY")
    @Max(value = 3, message = "cropCount should not be greater than 3")
    private int cropCount;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private Long phone;

    @Column(name = "Region")
    private String Region;
    @Enumerated(EnumType.STRING)
    @Column(name="Water_Resource")
    private WaterResource waterResource;
    public enum WaterResource{
        WELL,BOREWELL,RIVER,LAKE,POND,RAINWATER,NONE;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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
                ", Region='" + Region + '\'' +
                ", waterResource=" + waterResource +
                '}';
    }

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

}
