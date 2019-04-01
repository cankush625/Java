package com.oops.inheritance;

public class dog extends animal {
    private int eyes;
    private String sound;
    private int tail;

    public dog(String name,int weight, int eyes, String sound, int tail) {
        super(name, 1, 1, weight); //we can pass values directly to the super by removing parameters from the base class
        this.eyes = eyes;
        this.sound = sound;
        this.tail = tail;
    }

    public void chew(){
        System.out.println("Chew method is called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat method is called!");
        chew();
        super.eat();
    }

    public void move(){
        System.out.println("Move method is called!");
        move(5);
    }

    public void run(){
        System.out.println("Run method is called!");
        move(10);
    }
}
