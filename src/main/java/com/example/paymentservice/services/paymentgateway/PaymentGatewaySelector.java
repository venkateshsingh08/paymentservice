package com.example.paymentservice.services.paymentgateway;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelector {

    private StripeGateway stripeGateway;
    private RazorPayGateway razorPayGateway;

    public PaymentGatewaySelector(StripeGateway stripeGateway,RazorPayGateway razorPayGateway){
        this.stripeGateway = stripeGateway;
        this.razorPayGateway = razorPayGateway;
    }

    public PaymentGateway get(){
        return null;
    }
}
