package com.solid.srp;

public class PaymentProcessor {
    public void pay(Order order, String paymentType, String securityCode) {
        if ("debit".equals(paymentType)) {
            System.out.println("Processing debit payment type");
            System.out.println("Verifying security code: " + securityCode);
            order.setStatus("paid");
        } else if ("credit".equals(paymentType)) {
            System.out.println("Processing credit payment type");
            System.out.println("Verifying security code: " + securityCode);
            order.setStatus("paid");
        } else {
            throw new RuntimeException("Unknown payment type: " + paymentType);
        }
    }
}
