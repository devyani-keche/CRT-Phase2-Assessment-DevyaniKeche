// Q13

package com.devyani.postassessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devyani.postassessment.dto.PaymentResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CircuitBreakerExample {

    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(
            name = "paymentService",
            fallbackMethod = "fallbackPayment")

    public PaymentResponse makePayment() {

        return restTemplate.getForObject(
                "http://payment-service/pay",
                PaymentResponse.class);
    }

    public PaymentResponse fallbackPayment(
            Exception ex) {

        PaymentResponse response =
                new PaymentResponse();

        response.setStatus("Payment Service Down");

        return response;
    }
}