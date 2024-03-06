package com.finalProject.finalProject.weathernew;

import org.testng.reporters.jq.Main;

public class ExternalWeatherResponse{
    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "ExternalWeatherResponse{" +
                "main=" + main +
                '}';
    }
}