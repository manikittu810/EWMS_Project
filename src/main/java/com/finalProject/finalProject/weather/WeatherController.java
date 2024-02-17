package com.finalProject.finalProject.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService=weatherService;
    }

    @GetMapping("/weather")
    public Mono<WeatherDataDTO> getWeather(@RequestParam double latitude,@RequestParam double longitude) {
        return weatherService.getWeatherData(latitude,longitude)
                .map(data -> {
                    return new WeatherDataDTO(data.getTemparature(), data.getHumidity());
                });
    }

}
