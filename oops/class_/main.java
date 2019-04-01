package com.oops.class_;

public class main {
    public static void main(String[] args){
        car lamborghini = new car();
        car_ bentley = new car_();

        lamborghini.model = "aventador";
        lamborghini.engine = "xva8r6";
        lamborghini.year = "2011";
        lamborghini.color = "green";

        System.out.println("The model is "+bentley.getModel()); // Null is the internal default state for class
        bentley.setModel("continental_GT");
        bentley.setYear("2018");

        System.out.println("The model is "+bentley.getModel());
        System.out.println("The year is "+bentley.getYear());

    }
}
