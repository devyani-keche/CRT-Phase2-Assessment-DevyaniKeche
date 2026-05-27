// Q12

package com.devyani.postassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PostAssessmentTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                PostAssessmentTestApplication.class,
                args);
    }
}