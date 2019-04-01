package com.oops.inheritance;

public class lamborghini extends car {
    private int speed;
    private String color;

    public lamborghini(String name, String model, int engine, int speed, String color) {
        super(name, model, engine, 4);
        this.speed = speed;
        this.color = color;
    }

    public void sound(){
        System.out.println("Sound method is called!");
    }

    @Override
    public void run() {
        System.out.println("Lamborghini rum method is called!");
        sound();
        super.run();
    }
}
