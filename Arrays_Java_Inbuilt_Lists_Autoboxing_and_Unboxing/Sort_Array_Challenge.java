package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing;

import java.util.Scanner;

public class Sort_Array_Challenge {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values");

        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int[] sortIntegers(int[] array){
        boolean flag = true;
            while(flag) {
                flag = false;
                for(int i = 0; i < array.length-1; i++){
                    if (array[i] < array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        flag = true;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contains " + array[i]);
        }
    }

    public static void main(String[] args){
        int[] myArray = getIntegers(5);
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);
    }
}

//by Ankush Chavan