package com.qascript;

import java.util.ArrayList;

public class listexample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(25);
        arrayList.add(75);

        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
    }
}
