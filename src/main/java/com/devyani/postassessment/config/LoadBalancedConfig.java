// Q15

package com.devyani.postassessment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalancedConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}