package com.Inner_Classes_and_Abstract_Class.Abstract_Class;

public class Animal_main {
    public static void main(String[] args) {
        Dog dog = new Dog("vffd");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("sfsd");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
