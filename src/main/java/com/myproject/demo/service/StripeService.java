package com.myproject.demo.service;

import org.springframework.stereotype.Service;

import com.stripe.Stripe;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

@Service
public class StripeService {

    public StripeService() {
        Stripe.apiKey = "sk_test_your_secret_key_here";
    }

    public String createCheckoutSession(String currency, Long amount, String successUrl, String cancelUrl) throws Exception {
        SessionCreateParams params
                = SessionCreateParams.builder()
                        .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
                        .setMode(SessionCreateParams.Mode.PAYMENT)
                        .setSuccessUrl(successUrl)
                        .setCancelUrl(cancelUrl)
                        .addLineItem(
                                SessionCreateParams.LineItem.builder()
                                        .setPriceData(
                                                SessionCreateParams.LineItem.PriceData.builder()
                                                        .setCurrency(currency)
                                                        .setUnitAmount(amount)
                                                        .setProductData(
                                                                SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                                                        .setName("Sample Product")
                                                                        .build())
                                                        .build())
                                        .setQuantity(1L)
                                        .build())
                        .build();

        Session session = Session.create(params);
        return session.getUrl();
    }
}
