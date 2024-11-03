package com.example.paymentservice.controllers;


import com.example.paymentservice.services.paymentgateway.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public String initiatePayment() {
        return paymentService.initiatePayment();
    }
}
