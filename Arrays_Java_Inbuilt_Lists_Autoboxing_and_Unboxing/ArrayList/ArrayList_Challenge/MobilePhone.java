package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.ArrayList_Challenge;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addRecord(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already in file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void printMobileRecord(){
        System.out.println("We have " + myContacts.size() + " records");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i));
        }
    }

    public boolean updateContact(Contact existedContact, Contact newContact){
        int position = findContact(existedContact);
        if (position < 0){
            System.out.println("Contact not found!");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println(existedContact.getName() + " is replaced with " +newContact.getName());
        return true;
    }

    public void removeRecord(Contact value){
        int position = findContact(value);
        if (position >= 0){
            removeRecord(position);
        }
    }

    public void removeRecord(int position){
        myContacts.remove(position);
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return 1;
            }
        }
        return -1;
    }
}
