package org.platzi.payments;

public interface PaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest request);
}
