package com.example.paymentservice.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/payment")
    public String initiatePayment(){

        return null;

    }
}
