package com.finalProject.finalProject.weathernew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public ResponseEntity<?> getWeather(@RequestParam("lat") double latitude, @RequestParam("lon") double longitude) {
        return ResponseEntity.ok(weatherService.getFilteredWeatherData(latitude, longitude));
    }
}
