package com.solid.principle.open_closed;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private List<Integer> quantities;
    private List<Double> eachPrice;
    private String status;

    public Order() {
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.eachPrice = new ArrayList<>();
        this.status = "open";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addItem(String name, int quantity, double price) {
        items.add(name);
        quantities.add(quantity);
        eachPrice.add(price);
    }

    public double totalPrice() {
        double total = 0.0;
        for (int i=0; i<items.size(); i++) {
            total = total + (quantities.get(i)*eachPrice.get(i));
        }
        return total;
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Keyboard", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB cable", 2, 5);

        System.out.println(order.totalPrice());

        PaymentProcessor paymentProcessor = new DebitProcessor();
        paymentProcessor.pay(order, "D0372846");

//        paymentProcessor = new CreditProcessor();
//        paymentProcessor.pay(order, "C0372846");
//
//        paymentProcessor = new UpiProcessor();
//        paymentProcessor.pay(order, "U0372846");
    }

}

