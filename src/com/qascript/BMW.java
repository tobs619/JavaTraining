package com.qascript;

public class BMW extends Cars{

    public static void main(String[] args) {
        start();
        accelrate();
        brakes();
    }

    public static void brakes(){
        System.out.println("Press the brakes");

    }

    public static void start(){
        String key = "ON";
        System.out.println("Turn the car key " + key);
    }
}
