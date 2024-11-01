package com.buzzverse.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                // Permit all users to access signup and login endpoints
                .requestMatchers("/auth/signup", "/auth/login/request-otp", "/auth/login/verify-otp").permitAll()
                
                // Allow unauthenticated access to the profile read endpoint (GET /api/profiles/{id})
                .requestMatchers("/api/profiles/{id}").permitAll()
                
                // Require authentication for all other requests, including profile creation, update, and delete
                .anyRequest().authenticated()
            .and()
                // Configure form login (if required), or you can use other authentication mechanisms
                .formLogin().permitAll()
            .and()
                // Optionally configure logout
                .logout().permitAll();
        
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
