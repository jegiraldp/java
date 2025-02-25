package com.jegiraldp.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;
    private PaymentGateway paymentGateway;

    @Before
    public void setUp() {
         paymentGateway = Mockito.mock(PaymentGateway.class);
         paymentProcessor=new PaymentProcessor(paymentGateway);

    }

    @Test
    public void payment_is_correct() {


        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));


        boolean result=paymentProcessor.makePayment(1000);

        assertTrue(result);


    }

    @Test
    public void payment_is_wrong() {


        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));


        boolean result=paymentProcessor.makePayment(1000);
        assertFalse(result);


    }

}