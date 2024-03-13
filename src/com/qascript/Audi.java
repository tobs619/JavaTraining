package com.qascript;

import java.security.PublicKey;




public class Audi {

    public static void main(String[] args) {
        Cars audi = new Cars();
        audi.setColour("red");
        audi.setSize(66);
        audi.setWeight(21.34);
        audi.displayCars();

        Cars.accelrate();
        Cars.start();


        displaylogo("A");
        displaylogo(100);

        
    }

    public static void displaylogo(String s1){
        System.out.println("Logos is  " + s1);
    }

    public static void displaylogo(int s){
        System.out.println("Logo is " +s);

    }
}
