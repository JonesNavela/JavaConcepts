package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 120;
        short myShort = 32760;

        int myInt = 20_474_83647;

        long myLong = 50000 + 10 * (myByte + myShort + myInt);

        System.out.println(myLong);
    }
}
