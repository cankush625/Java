package com.datatypes_and_operators;

public class string {
    public static void main(String[] args){
        String myString = "Hello I'm Ankush";
        System.out.println("My string is "+myString);

        myString = myString + " and I'm a hacker!";
        System.out.println("My string is "+myString);

        myString = myString + " \u00A9 2019.";
        System.out.println("My string is "+myString);

        String numberString = "86";
        numberString = numberString + "66";
        System.out.println("The number string is "+numberString);

        String lastString = "67";
        int myNum = 87;
        lastString = lastString+myNum;
        System.out.println("The addition of string and integer is "+lastString);
    }
}
