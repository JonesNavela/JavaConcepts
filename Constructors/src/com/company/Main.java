package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount travelingSavings = new BankAccount("12345", 9000000, "Jones Navela", "NavelaJones@gmail.com", "074 521 5647");
        System.out.println(travelingSavings.getCustomerName());
        System.out.println(travelingSavings.getCustomerEmail());
        System.out.println(travelingSavings.getCustomerPhoneNumber());
        System.out.println(travelingSavings.getNumber());
        System.out.println(travelingSavings.getBalance());

        System.out.println("***********************");

	    travelingSavings.withdrawal(200);

	    travelingSavings.deposit(50);
	    travelingSavings.withdrawal(200);

        System.out.println("***********************");

        BankAccount myAccount = new BankAccount("213448", 500000, "Rhulani Navela","rhunavela@gmail.com","0723456954");
        System.out.println("Account name: " + myAccount.getCustomerName());
        System.out.println("Account email: " + myAccount.getCustomerEmail());
        System.out.println("Account number: " + myAccount.getNumber());
        System.out.println("Account balance: " + myAccount.getBalance());

        System.out.println("*********************");

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Jakes", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Josh", 100.00, "Josh@email.com");
        System.out.println(customer3.getName());
    }
}

//create a new class for a bank account
//create fields for the account number, balance, customer name, email and phone number
//
//create getters and setters for each field ( So, a setter is a method that updates value of a variable. And a getter is a method that reads value of a variable.)
//create two additional methods
//1. To allow the customer to deposit funds (this should increment the balance field)
//2. To allow the customer to withdraw funds. This should deduct from the balance field,
//but not allow the withdrawal to complete if there are insuffucuent funds
//You will want to create various code in the Main class (the one created by IntelliJ) to
//confirm your code is working
//add some System.out.println's in the two methods above as well.