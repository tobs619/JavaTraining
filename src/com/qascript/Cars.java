package com.qascript;

public class Cars {
    private String colour;
    private int size;
    private double weight;


    public static void start(){
        System.out.println("Press the start key");
    }
    public static void accelrate(){
        System.out.println("Press the accelerator");
    }

    public void setColour(java.lang.String colour){
        this.colour = colour;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void displayCars(){
        System.out.println("Colour of the car is: " + colour);
        System.out.println("Weight of the car is:  " + weight);
        System.out.println("Size of the car is:  " + size);
    }
}
