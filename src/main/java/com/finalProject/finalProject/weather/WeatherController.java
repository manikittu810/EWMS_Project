package com.finalProject.finalProject.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam double latitude, @RequestParam double longitude) {
//        return weatherService.getWeatherData(latitude, longitude)
//                .map(data -> new WeatherDataDTO(
//                        data.getTemperature(),
//                        data.getHumidity(), data.getRain(),data.getDescription()));

        WeatherResponse weatherData = weatherService.getWeatherData(latitude,longitude).block();
        return weatherData;
    }
}
