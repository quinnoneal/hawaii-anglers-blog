package com.hifishing.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().permitAll());
        // use basic authentication
        http.httpBasic();

        // disable csrf
        http.csrf().disable();
        http.headers().frameOptions().disable();

        return http.build();
    }
}
