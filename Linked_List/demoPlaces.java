package com.Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class demoPlaces {
    private static Scanner scanner = new Scanner(System.in);
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();

        places.add("Mumbai");
        places.add("Pune");
        places.add("New York");
        places.add("Sydney");
        places.add("Manchester");
        places.add("Barcelona");
        places.add("Cambridge");

        printList(places);

        //Adding at the index position
        places.add(4, "Dubai");
        printList(places);

        //Removing the record from linked list
        places.remove(7);
        printList(places);

        //Inorder method
        LinkedList<String> places1 = new LinkedList<>();
        addInOrder(places1, "Mumbai");
        addInOrder(places1, "Pune");
        addInOrder(places1, "New York");
        addInOrder(places1, "Sydney");
        addInOrder(places1, "Manchester");
        addInOrder(places1, "Barcelona");
        addInOrder(places1, "Cambridge");

        printList(places1);

        addInOrder(places1, "London");
        addInOrder(places1, "Mumbai");
        printList(places1);

        visit(places1);
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //Its equal, do not add
                System.out.println(newCity + " is already exist");
                return false;
            }else if (comparison > 0) {
                //new city should appear before this
                stringListIterator.previous();  //as we done stringListIterator.next() earlier
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0) {
                //move on to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        boolean quit = false;
        boolean goingForward = true;  //Optional step
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.getFirst() == ""){
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0 :
                    System.out.println("Vacation is over!");
                    quit = true;
                    break;

                case 1 :
                    if (!goingForward) {  //Optional step. Extra checkout to ensure we are going forward
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2 :
                    if (goingForward) {  //Optional step. Extra checkout to ensure we are going forward
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3 :
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("The available actions are : ");
        System.out.println("0. Quit");
        System.out.println("1. Go to next city");
        System.out.println("2. Go to previous city");
        System.out.println("3. Print menu options");
    }
}

//by Ankush Chavan