package com.hifishing.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // list of endpoints that non-logged in users can access
    private static final String[] WHITELIST = {
            "/",
            "/shop",
            "/posts",
            "/sign-in",
            "/register",
            "/h2-console/**",
            "/resources/**"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(WHITELIST).permitAll()
                        .requestMatchers(HttpMethod.GET, "/posts/**").permitAll()
                        .anyRequest().authenticated());
        // use basic authentication
        http.httpBasic();

        // disable csrf
        //http.csrf().disable();
        //http.headers().frameOptions().disable();

        return http.build();
    }
}
