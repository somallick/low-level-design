package com.design.pattern.structural.decorator.example1;

public class CarShopMain {
    public static void main(String[] args) {
        ICar scorpio = new Scorpio();
        System.out.println(scorpio.getDescription());
        System.out.println(scorpio.getWeight());

        ICar bulletProofScorpio = new BulletProof(scorpio);
        System.out.println(bulletProofScorpio.getDescription());
        System.out.println(bulletProofScorpio.getWeight());
    }
}
