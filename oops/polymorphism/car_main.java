package com.oops.polymorphism;

class car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public car(String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String message(){
        return "No message to display";
    }

    public String startEngine(){
        return "Start Engine method is called";
    }

    public String accelerate(){
            return "Accelerate method is called";
    }

    public String brake(){
            return "Brake method is called";
    }
}

class Lamborghini extends car{
    public Lamborghini(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        System.out.println("Lamborghini engine is started!");
        //To get class name we can use getClass().getSimpleName() method in java
        return "Ignition starts";
    }

    @Override
    public String accelerate() {
        System.out.println("lamborghini is accelerated");
        return "Lamborghini is in motion";
    }

    @Override
    public String brake() {
        System.out.println("Brakes are applied");
        return "";
    }
}

class Mercedeze extends car{
    public Mercedeze(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        System.out.println("Mercedeze engine is started!");
        return "Ignition starts";
    }

    @Override
    public String accelerate() {
        System.out.println("Mercedeze is accelerated");
        return "Mercedeze is in motion";
    }

    @Override
    public String brake() {
        System.out.println("Brakes are applied");
        return "";
    }
}

public class car_main {
    public static void main(String[] args) {
        car Car = new car("Base Class", 8);
        System.out.println(Car.startEngine());
        System.out.println(Car.accelerate());
        System.out.println(Car.brake());

        Lamborghini lamborghini = new Lamborghini("Aventador", 8);
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.brake());

        Bentley bentley = new Bentley("Continental GT", 6);
        System.out.println(bentley.startEngine());
        System.out.println(bentley.accelerate());
        System.out.println(bentley.brake());

        Mercedeze mercedeze = new Mercedeze("S class", 6);
        System.out.println(mercedeze.startEngine());
        System.out.println(mercedeze.accelerate());
        System.out.println(mercedeze.brake());
    }
}

//By Ankush Chavan