package com.oops.inheritance;

public class animal {
    private String name;
    private int brain;
    private int legs;
    private int weight;

    public animal(String name, int brain, int legs, int weight) {
        this.name = name;
        this.brain = brain;
        this.legs = legs;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Eat method is called!");
    }

    public void move(int speed){
        System.out.println("Animal is moving at speed "+speed);
    }

    public void run(int runSpeed){
        System.out.println("Animal is running at speed "+runSpeed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getLegs() {
        return legs;
    }

    public int getWeight() {
        return weight;
    }
}
