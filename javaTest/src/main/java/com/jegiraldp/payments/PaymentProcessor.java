package com.jegiraldp.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus()==PaymentResponse.PaymentStatus.OK){
            return true;
        }else{
            return false;
        }
    }

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
