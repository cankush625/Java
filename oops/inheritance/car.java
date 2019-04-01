package com.oops.inheritance;

public class car {
    private String name;
    private String model;
    private int engine;
    private int wheels;

    public car(String name, String model, int engine, int wheels){
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void run(){
        System.out.println("Run method is called!");
    }
}
