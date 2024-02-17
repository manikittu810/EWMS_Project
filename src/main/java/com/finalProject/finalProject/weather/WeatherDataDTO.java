package com.finalProject.finalProject.weather;

public class WeatherDataDTO {
    private double temparature;
    private double humidity;

    public WeatherDataDTO(double temparature, double humidity) {
        this.temparature = temparature;
        this.humidity = humidity;
    }

    public double getTemparature() {
        return temparature;
    }

    public void setTemparature(double temparature) {
        this.temparature = temparature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
