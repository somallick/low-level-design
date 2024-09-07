package com.solid.principle.open_closed;

public interface PaymentProcessor {
    void pay(Order order, String securityCode);
}
