package com.finalProject.finalProject.weathernew;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {

    @Autowired
    private OpenWeatherMapClient openWeatherMapClient;

    @Value("${openweathermap.api.key}")
    private String apiKey;

    public String getFilteredWeatherData(Double latitude, Double longitude) {
        ResponseEntity<String> response = openWeatherMapClient.getWeather(latitude, longitude, apiKey);

        // Parse the JSON response and filter the required fields
        return filterWeatherData(response.getBody());
    }

    private String filterWeatherData(String jsonData) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonData);

            ObjectNode filteredData = mapper.createObjectNode();
            filteredData.set("coord", root.path("coord"));
            filteredData.put("weather",root.path("weather").get(0).path("description").asText());
            filteredData.put("clouds", root.path("clouds").path("all").asInt());
            filteredData.put("humidity", root.path("main").path("humidity").asInt());
            double tempInCelsius = root.path("main").path("temp").asDouble() - 273.15;
            filteredData.put("temp", Math.round(tempInCelsius * 100.0) / 100.0);
            if (root.has("rain") && root.path("rain").has("1h")) {
                filteredData.put("rain_1h", root.path("rain").path("1h").asDouble());
            } else {
                filteredData.put("rain_1h", 0); // Consider setting a default value or omitting the field
            }




            return mapper.writeValueAsString(filteredData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}"; // Return an empty object in case of parsing error
        }
    }

}
