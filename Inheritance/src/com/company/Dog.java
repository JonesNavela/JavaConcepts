package com.company;

public class Dog extends Animal {
    // Unique characteristics related to a dog specifically on top of the base characteristics of an animal
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight) {
        super(name, 1, 1, size, weight);
    }
}
