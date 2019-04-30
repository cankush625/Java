package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing;
import java.util.Scanner;

public class List_And_Array_List {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + "");
        }
        System.out.println();
    }

    private static void resizeArray(){
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }

    public static void main(String[] args){
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers");
        getInput();
        printArray(baseData);
    }
}
