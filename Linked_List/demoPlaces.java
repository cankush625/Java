package com.Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class demoPlaces {
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
}
