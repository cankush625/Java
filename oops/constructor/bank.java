package com.oops.constructor;

public class bank {

    private double balance;
    private double withdrawl;

    public bank(){
        this(5000, 3000);
        System.out.println("Empty constructor called!");
    }

    public bank(double balance, double withdrawl){
        System.out.println("Parameterized constructor is called!");
        System.out.println("The available balance is "+balance);
        System.out.println("Your currently requested withdrawl of Rs."+withdrawl);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
