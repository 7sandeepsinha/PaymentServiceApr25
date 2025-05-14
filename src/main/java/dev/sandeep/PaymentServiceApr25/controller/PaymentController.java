package dev.sandeep.PaymentServiceApr25.controller;

import dev.sandeep.PaymentServiceApr25.dto.PaymentLinkReqDTO;
import dev.sandeep.PaymentServiceApr25.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity generatePaymentLink(@RequestBody PaymentLinkReqDTO paymentLinkReqDTO) {
        String paymentLink = paymentService.generatePaymentLink(paymentLinkReqDTO.getOrderId(),
                paymentLinkReqDTO.getUserId(),
                paymentLinkReqDTO.getAmount());
        return ResponseEntity.ok(paymentLink);
    }
}
