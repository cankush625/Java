package com.packages_and_naming_conventions.scope_check.scope_challenge;

import java.util.Scanner;

public class ScMain {
    public static void main(String[] args) {
        //Write a small program to read an integer from the keyboard (using scanner) and print out the times table for
        //that number. Table should run from 1 to 12.
        //
        //You are allowed to use one variable scanner for your Scanner instance. You can use as many other variables
        //as you need, but they all must be called x. That includes any class instances and loop control variables that
        //you may decide to use.
        //
        //If you use a class, the class can be called X(capital), but any instances of it must be called x(lower case).
        //
        //Any methods you create must also be called x.
        //
        //Optional extra :
        //Change your program so that all variables(including the scanner instance) are called x.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
