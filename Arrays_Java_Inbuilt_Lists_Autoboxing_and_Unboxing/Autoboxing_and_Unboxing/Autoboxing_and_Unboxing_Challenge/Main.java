package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.Autoboxing_and_Unboxing.Autoboxing_and_Unboxing_Challenge;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("Bank of America");

        if (bank.addBranch("California")){  //here we added a new branch named California
            System.out.println("California branch created!");
        }

        bank.addCustomer("California", "Ankush", 13899.4);
        bank.addCustomer("California", "Roshan", 13244.54);
        bank.addCustomer("California", "Mike", 13344.4);

        bank.addBranch("New York");  //here we added a new branch named New York

        bank.addCustomer("New York", "Adam", 11322.5);
        bank.addCustomer("New York", "Jose", 13536.67);
        bank.addCustomer("New York", "Alister", 13324.34);

        bank.addCustomerTransaction("California", "Ankush", 342);
        bank.addCustomerTransaction("California", "Ankush", 133);
        bank.addCustomerTransaction("California", "Roshan", 456);

        bank.listCustomers("California", true);
        bank.listCustomers("New York", true);
    }
}

//by Ankush Chavan