package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.ArrayList_Challenge;

public class Contact {
    private String name;
    private String PhoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}

//by Ankush Chavan