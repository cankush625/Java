package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing;

public class array {
    public static void main(String[] args) {
        //First method
        int[] myArray = new int[10];
        myArray[0] = 10;
        myArray[1] = 20;

        System.out.println(myArray[0]);
        System.out.println(myArray[1] + "\n");

        //Second method
        int[] myArray1 = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(myArray1[1]);
        System.out.println(myArray1[7] + "\n");

        //Third method
        int[] myArray2 = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray2[i] = i * 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("The element " + i + " value is " + myArray2[i]);
        }
        System.out.println("\n");

        //Or we can make it more efficient as
        int[] myArray3 = new int[20];
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = i * 10;
        }

        for (int i = 0; i < myArray3.length; i++) {
            System.out.println("The element " + i + " value is " + myArray3[i]);
        }
        System.out.println("\n");

        //Another one method is
        int[] myArray4 = new int[5];
        for (int i = 0; i < myArray4.length; i++) {
            myArray4[i] = i * 10;
        }

        printArray(myArray4);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element " + i + " value is " + array[i]);
        }
    }
}
//By Ankush Chavan