package com.company;

public class Main {

    public static void main(String[] args) {
	    Mustang mustang = new Mustang(36);
        mustang.steer(45);
        mustang.accelerate(30);
        mustang.accelerate(20);
        mustang.accelerate(-42);
    }
}

// Challenge
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class
// Finally, create another class, a specific type of Car that inherits from the Car class
// You should be able to hand steering, changing geers, and moving/speed
// You'll decide where to put the appropriate state and behaviours(fields and methods)
// As mentioned above, changing geers, increasing/decreasing speed should be included
// For your specific type of vehicle, you will want to add something specific for that type of car
