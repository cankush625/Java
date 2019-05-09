package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.ArrayList_Challenge;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already in file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void printContact(){
        System.out.println("We have " + myContacts.size() + " contacts");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " +
                                              this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean updateContact(Contact existedContact, Contact newContact){
        int position = findContact(existedContact); //some bug is here
        if (position < 0){
            System.out.println("Contact not found!");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println(existedContact.getName() + " is replaced with " +newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position < 0){
            System.out.println("Contact not found!");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " is deleted successfully!");
        return true;
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

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
}

//by Ankush Chavan