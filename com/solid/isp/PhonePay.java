package com.solid.isp;

public class PhonePay implements UpiPayment{
    @Override
    public void payMoney() {
        System.out.println(this.getClass().getName() + ": Paying money...");
    }

    @Override
    public void getScratchCard() {
        System.out.println(this.getClass().getName() + ": Got scratch card...");
    }
}