package com.finalProject.finalProject.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/secure-data")
    public String getSecureData(@RequestHeader("Authorization") String authorizationHeader) {
        // Use the authorizationHeader value as needed
        return "Data accessed with Authorization header: " + authorizationHeader;
    }


}
