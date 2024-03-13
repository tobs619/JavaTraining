package com.qascript;

import java.util.Arrays;

public class ArrayMethod {

    public static void main(String[] args) {
        int[] arr = {9,4,1,8,10};
        int[] arr2 = {2,6,3,5,11,7};
        Arrays.sort(arr);

        System.out.println("Length of array is:  " + arr.length);
        System.out.println("Sorted array:  "+ Arrays.toString(arr));

        if(arr.equals(arr2)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }

    }
}
