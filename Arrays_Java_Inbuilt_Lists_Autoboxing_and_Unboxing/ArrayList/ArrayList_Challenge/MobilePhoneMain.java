package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.ArrayList_Challenge;

import java.util.Scanner;

public class MobilePhoneMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args){
        boolean quit = false;
        welcome();
        printInstructions();
        int choice;

        while(!quit){
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    mobilePhone.printContact();
                    break;
                case 2 :
                    addContact();
                    break;
                case 3 :
                    updateContact();
                    break;
                case 4 :
                    removeContact();
                    break;
                case 5 :
                    queryContact();
                    break;
                case 6 :
                    System.out.println("Exiting the application!");
                    quit = true;
                    break;
            }
        }
    }

    private static void welcome(){
        System.out.println("Starting Phone...");
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println(" 0 - To print choice options");
        System.out.println(" 1 - To print the list of mobile variants");
        System.out.println(" 2 - To add an item to the list");
        System.out.println(" 3 - To update an item in the list");
        System.out.println(" 4 - To remove an item from the list");
        System.out.println(" 5 - To search for an item in the list");
        System.out.println(" 6 - To quit he application");
    }

    public static void addContact(){
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter the Mobile Number");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addContact(contact)){
            System.out.println("New contact added Name : " + name + " Phone Number : " + phoneNumber);
        }else{
            System.out.println("Unable to add, Contact with name " + name + " is already exist");
        }
    }

    public static void updateContact(){
        System.out.println("Enter the existing contact name : ");
        String existingName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingName);
        if (existingContactRecord == null){
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("Enter new name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number : ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Contact updated successfully!");
        }else{
            System.out.println("Error updating contact!");
        }
    }

    public static void removeContact() {
        System.out.println("Enter the existing contact name : ");
        String existingName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted!");
        }else{
            System.out.println("Error deleting contact!");
        }
    }

    public static void queryContact() {
        System.out.println("Enter the existing contact name : ");
        String existingName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("Name : " + existingContactRecord.getName() + " Phone Number : " + existingContactRecord.getPhoneNumber());
    }
}

//by Ankush Chavan