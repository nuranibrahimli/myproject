package com.myproject.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.service.StripeService;

@RestController
public class PaymentController {

    private final StripeService stripeService;

    public PaymentController(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @GetMapping("/create-checkout-session")
    public String createCheckoutSession(
            @RequestParam(required = false) String currency,
            @RequestParam(required = false) Long amount) throws Exception {
        currency = (currency != null) ? currency : "usd";
        amount = (amount != null) ? amount : 1000L;

        String successUrl = "http://localhost:8080/payment/success";
        String cancelUrl = "http://localhost:8080/payment/cancel";
        return stripeService.createCheckoutSession(currency, amount, successUrl, cancelUrl);
    }

    @GetMapping("/payment/success")
    public String paymentSuccess() {
        return "Payment Successful!";
    }

    @GetMapping("/payment/cancel")
    public String paymentCancel() {
        return "Payment Cancelled!";
    }
}
