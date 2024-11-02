package com.example.paymentservice.services.paymentgateway;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RazorPayGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink() {
        return null;
    }
}
