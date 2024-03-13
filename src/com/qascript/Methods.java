package com.qascript;

public class Methods {

    public static void main(java.lang.String[] args) {

        addNumbers(4,5);
        addNumbers(6,8);
        addNumbers(7,2);

        int result = addNumbers(6,5);
        int output = result + 5;
        System.out.println("Increment the output: "+ output);
    }

    private static int addNumbers(int num1, int num2) {

        int res = num1 + num2;
        System.out.println("Addition of 2 numbers: "+res);
        return res;
        
    }


}
