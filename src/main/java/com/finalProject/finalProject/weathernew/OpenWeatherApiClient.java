package com.finalProject.finalProject.weathernew;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openWeatherMapClient", url = "${openweathermap.api.url}")
public interface OpenWeatherApiClient {
    @GetMapping
     ResponseEntity<String>getWeather(@RequestParam ("q") String city, @RequestParam("appid") String appiKey){

    }
}
