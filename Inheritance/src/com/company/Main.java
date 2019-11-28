package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors
        // of a parent object. It is an important part of OOPs (Object Oriented programming system).
        // The idea behind inheritance in Java is that you can create new classes
        // that are built upon existing classes.

        Animal animal = new Animal("Animal", 1, 1, 5,5);

        Dog dog = new Dog("Rusty",10,8,2, 4, 1, 24, "fur");
        System.out.println("My dog's name is : " + dog.getName() + " and he weighs " + dog.getWeight() + "KG ");
    }
}
