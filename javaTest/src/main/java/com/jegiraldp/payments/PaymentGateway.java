package com.jegiraldp.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
