package com.Inner_Classes_and_Abstract_Class.Abstract_Class;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
