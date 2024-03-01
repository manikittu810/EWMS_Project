package com.finalProject.finalProject.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorize -> authorize
//                        .requestMatchers("/resources/**").permitAll()
//                        .requestMatchers("/public/**", "/registration", "/login").permitAll()
//                        .requestMatchers("/weather").permitAll()
//                        .requestMatchers("/farmer-list").authenticated()
//                        .anyRequest().authenticated()
//                )
//                .formLogin() // Use form-based authentication
//                .and()
//                .csrf().disable();
//        return http.build();
//    }
@Bean
SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

    http.authorizeHttpRequests(auth ->{
        auth.anyRequest().authenticated();
    });

    http.sessionManagement(
            session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    );
    //Allows all the requests to trigger
    http.httpBasic();
    http.csrf().disable();
    return http.build();

}
}