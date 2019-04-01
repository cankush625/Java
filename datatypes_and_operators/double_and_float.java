package com.datatypes_and_operators;

public class double_and_float {
    public static void main(String[] args){
        int myIntValue = 5; //width of int 32 (4 bytes)
        float myFloatValue = 5f; //width of float 32 (4 bytes)
        float myFloatValue1 = (float) 5.4;
        double myDoubleValue = 5d; //width of double 64 (8 bytes)
        double myDoubleValue1 = 5;

        System.out.println("My integer value = "+myIntValue);
        System.out.println("My float value = "+myFloatValue);
        System.out.println("My double value = "+myDoubleValue);

        //Program to convert given number of pounds to the kilograms

        double noOfPounds = 50d;
        double result;

        result = noOfPounds * 0.45359237;

        System.out.println("The " + noOfPounds + " pounds are equal to the " + result + " kilograms");
    }
}
