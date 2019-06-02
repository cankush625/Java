package com.Inner_Classes_and_Abstract_Class.Inner_Class;

public class Gearbox_Main {
    public static void main(String[] args) {
        Gearbox Lamborghini = new Gearbox(8);
        Gearbox.Gear first = Lamborghini.new Gear(1, 12.7);
        System.out.println(first.driveSpeed(1000));
    }
}

//by Ankush Chavan