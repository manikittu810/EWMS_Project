package com.finalProject.finalProject.weathernew;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Autowired
    private OpenWeatherApiClient openWeatherApiClient;
    @Value("${weather.apikey")
    private String apiKey;
    public String getFilteredWeatherData(String City){

        // Parse the JSON response and filter the required fields
        return getFilteredWeatherData(response.getBody());
    }

    private String filteredWeatherData(String JsonData){
        // Implement JSON parsing and filtering logic here
        // Use libraries like Jackson or Gson to parse the JSON
        // Extract and return the required fields in a JSON format

        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonData);
            ObjectNode FilteredData=mapper.createObjectNode();
            filteredWeatherData.set("coord",root.path(""coord));
        }
    }
}
