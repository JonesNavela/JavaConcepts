package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car();
        Car kia = new Car();
        Car bmw = new Car();

        audi.setModel("RS3 Quatro");
        System.out.println("Model is " + audi.getModel());
    }
}
