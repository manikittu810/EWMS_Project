package com.finalProject.finalProject.weather;
public class WeatherResponse {
    private double temperature;
    private double humidity;
    private double rain;
    private String description;

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WeatherResponse(double temperature, double humidity, double rain, String description) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.rain = rain;
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", rain=" + rain +
                ", description='" + description + '\'' +
                '}';
    }


}