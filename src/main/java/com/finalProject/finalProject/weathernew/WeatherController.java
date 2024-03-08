package com.finalProject.finalProject.weathernew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/weather")
@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    @GetMapping("/{city}")
    public ResponseEntity<String> getWeather(@PathVariable String city){
        String filteredWeatherData = weatherService.getFilteredWeatherData(city);
        return ResponseEntity.ok().body(filteredWeatherData);
    }
}
