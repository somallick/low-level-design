package com.design.pattern.structural.proxy.example1;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        ICar remoteProxy = new RemoteProxy();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the action");
            String action = sc.nextLine();

            switch (action) {
                case "left":
                    remoteProxy.turnLeft();
                    break;
                case "right":
                    remoteProxy.turnRight();
                    break;
                case "straight":
                    remoteProxy.goStraight();
                    break;
                default:
                    System.out.println("Invalid Action");
                    break;
            }
        }
    }
}
