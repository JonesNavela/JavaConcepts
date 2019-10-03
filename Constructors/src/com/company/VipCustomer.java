package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 2.50,"Default email");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, String email) {
        this("rhulani", 2.50, "rhu@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
