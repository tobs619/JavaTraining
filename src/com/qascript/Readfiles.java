package com.qascript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readfiles {
    public static void main(String[] args) {

        try {
            FileInputStream fits = new FileInputStream("txt");
            int c = fits.read();
            System.out.println((char) c);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
