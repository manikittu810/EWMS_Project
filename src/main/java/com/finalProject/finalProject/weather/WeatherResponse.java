package com.finalProject.finalProject.weather;

public class WeatherResponse {
    private double temparature;
    private double humidity;

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

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "temparature=" + temparature +
                ", humidity=" + humidity +
                '}';
    }
}
