package com.finalProject.finalProject.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;
    private final String apiKey;

    public WeatherService(WebClient.Builder webClientBuilder, @Value("${weather.api.key}") String apiKey) {
        this.webClient = webClientBuilder.baseUrl("http://api.openweathermap.org").build();
        this.apiKey = apiKey;
    }
    public Mono<WeatherResponse> getWeatherData(Double latitude, Double longitude) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/data/3.0/weather")
                        .queryParam("lat", latitude)
                        .queryParam("lon", longitude)
                        .queryParam("appid", apiKey)
                        .queryParam("units", "metric") // Assuming you want Celsius for temperature
                        .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class); // Automatically deserializing to WeatherResponse
    }
}