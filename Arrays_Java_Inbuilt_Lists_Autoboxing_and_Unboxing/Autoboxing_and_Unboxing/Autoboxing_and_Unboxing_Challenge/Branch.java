package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.Autoboxing_and_Unboxing.Autoboxing_and_Unboxing_Challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customer;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customer = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.customer.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customer.size(); i++){
            Customer checkedCustomer = this.customer.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
