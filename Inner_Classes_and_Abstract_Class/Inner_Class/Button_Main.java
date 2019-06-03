package com.Inner_Classes_and_Abstract_Class.Inner_Class;

import java.util.Scanner;

public class Button_Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");

    public static void main(String[] args) {
//        class clickListener implements Button.onClickListener {
//            public clickListener() {
//                System.out.println("I have been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        buttonPrint.setOnClickListener(new clickListener());
        buttonPrint.setOnClickListener(new Button.onClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 :
                    quit = true;
                    break;

                case 1 :
                    buttonPrint.onClick();
                    break;
            }
        }
    }
}

//by Ankush Chavan