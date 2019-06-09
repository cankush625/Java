package com.Java_Generics;

import java.util.ArrayList;

public class ArrayList_without_generics {
    public static void main(String[] args) {
        ArrayList items = new ArrayList(); //this allows us to add any type of items to the ArrayList

        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Ankush"); //this is valid but at the runtime the exception is occurs. String cannot be cast to integer
        items.add(4);
        items.add(5);

        printDouble(items);

        //To overcome this problem we are specifying the type of the data for the ArrayList
        ArrayList<Integer> records = new ArrayList<>();

        records.add(6);
        records.add(7);
        records.add(8);
        records.add(9);
        records.add(10);

        printDouble(records);
    }

        private static void printDouble(ArrayList n) {
            for (Object i:
                 n) {
                System.out.println((Integer) i * 2);
            }
    }
}

//by Ankush Chavan