package com.oops.constructor;

public class bank_main {
    public static void main(String[] args){
        bank boi = new bank();
        bank sbi = new bank(5000, 2000);

        boi.setBalance(100000);
        System.out.println("Your current balance is "+boi.getBalance());

        sbi.setBalance(10000);
        System.out.println("Your current balance is "+sbi.getBalance());
    }
}
