package com.finalProject.finalProject.weathernew;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openWeatherMapClient", url = "${openweathermap.api.url}")
public interface OpenWeatherMapClient {
    @GetMapping
    ResponseEntity<String> getWeather(@RequestParam("lat") double latitude, @RequestParam("lon") double longitude, @RequestParam("appid") String apiKey);
}

