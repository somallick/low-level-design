package com.solid.principle.open_closed;

public class DebitProcessor implements PaymentProcessor {
    @Override
    public void pay(Order order, String securityCode) {
        System.out.println("Processing debit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setStatus("paid");
    }
}
