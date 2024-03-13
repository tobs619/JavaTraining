package com.qascript;

public class Exception {
    public static void main(String[] args) {

        handleMathsException(100);
        handleNullException(null);
    }

    private static void handleMathsException(int number){
        try {int a = number/0;

        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
        }
    }

    private static void handleNullException(String s){
        try {
            System.out.println(s.length());
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
}
