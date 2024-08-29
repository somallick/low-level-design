package com.solid.ocp;

public interface PaymentProcessor {
    void pay(Order order, String securityCode);
}
