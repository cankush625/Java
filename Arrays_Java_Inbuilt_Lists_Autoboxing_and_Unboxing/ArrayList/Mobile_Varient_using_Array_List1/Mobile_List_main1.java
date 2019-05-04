package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.Mobile_Varient_using_Array_List1;

import java.util.Scanner;

public class Mobile_List_main1 {
    private static Scanner scanner = new Scanner(System.in);
    private static Mobile_List1 mobilelist = new Mobile_List1();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    mobilelist.printMobileVarient();
                    break;
                case 2 :
                    addMobileVarient();
                    break;
                case 3 :
                    modifyVarient();
                    break;
                case 4 :
                    removeVarient();
                    break;
                case 5 :
                    searchForVarient();
                    break;
                case 6 :
                    System.out.println("Exiting the application!");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\n 0 - To print choice options");
        System.out.println("\n 1 - To print the list of mobile variants");
        System.out.println("\n 2 - To add an item to the list");
        System.out.println("\n 3 - To modify an item in the list");
        System.out.println("\n 4 - To remove an item from the list");
        System.out.println("\n 5 - To search for an item in the list");
        System.out.println("\n 6 - To quit he application");
    }

    public static void addMobileVarient(){
        System.out.println("Please enter the mobile variants");
        mobilelist.addMobileVarient(scanner.nextLine());
    }

    public static void modifyVarient(){
        System.out.println("Enter the existing variant name : ");
        String variantName = scanner.nextLine();
        System.out.println("Enter replacement item : ");
        String newVarient = scanner.nextLine();
        mobilelist.modifyMobileVarient(variantName, newVarient);
    }

    public static void removeVarient(){
        System.out.println("Enter the existing variant name : ");
        String variantName = scanner.nextLine();
        mobilelist.removeMobileVarient(variantName);
        System.out.println("Item removed successfully");
    }

    public static void searchForVarient(){
        System.out.println("Variant to search for : ");
        String searchVarient = scanner.nextLine();
        if (mobilelist.ifExist(searchVarient)){
            System.out.println("Found! " + searchVarient + " is in our variant list");
        }else{
            System.out.println(searchVarient + " is not in our variant list");
        }
    }
}

// by Ankush Chavan