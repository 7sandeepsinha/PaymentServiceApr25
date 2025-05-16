package dev.sandeep.PaymentServiceApr25.service;

import dev.sandeep.PaymentServiceApr25.paymentGateway.PaymentGateway;
import dev.sandeep.PaymentServiceApr25.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    @Qualifier("stripePayment")
    private PaymentGateway paymentGateway;

    public String generatePaymentLink(String orderId, String userId, long amount){
        String paymentLink = paymentGateway.generatePaymentLink(orderId, amount, userId);
        return paymentLink;
    }
}

/*
Could not autowire. There is more than one bean of 'PaymentGateway' type.
Beans:
phonePePaymentGateway (PhonePePaymentGateway.java)
stripePaymentGateway (StripePaymentGateway.java)

Resolved with Qualifier
 */