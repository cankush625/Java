package com.interface_.Interface_Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class IC_main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Player cankush = new Player("cankush", 90, 40);
        System.out.println(cankush.toString());

        cankush.setHitpoints(95);
        System.out.println(cankush);
        cankush.setWeapon("Sword");
        savedObject(cankush);
        loadObject(cankush);
        System.out.println(cankush);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n0. Quit \n 1. To enter a string");

        while (!quit) {
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 :
                    quit = true;
                    break;

                case 1 :
                    System.out.println("Enter a string : ");
                    String stringInput;
                    stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.writedata().size(); i++) {
            System.out.println("Saving " +objectToSave.writedata().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.readData(values);
    }
}

//by Ankush Chavan