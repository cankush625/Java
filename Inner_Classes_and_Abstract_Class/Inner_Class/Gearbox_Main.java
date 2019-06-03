package com.Inner_Classes_and_Abstract_Class.Inner_Class;

public class Gearbox_Main {
    public static void main(String[] args) {
        Gearbox Lamborghini = new Gearbox(8);
//        Lamborghini.addGear(1, 12.7);
//        Lamborghini.addGear(2, 25.4);
//        Lamborghini.addGear(3, 39.8);
        Lamborghini.operateClutch(true);
        Lamborghini.changeGear(1);
        Lamborghini.operateClutch(false);
        System.out.println(Lamborghini.wheelSpeed(1000));
        Lamborghini.changeGear(2);
        System.out.println(Lamborghini.wheelSpeed(2000));
        Lamborghini.operateClutch(true);
        Lamborghini.changeGear(3);
        Lamborghini.operateClutch(false);
        System.out.println(Lamborghini.wheelSpeed(4000));
    }
}

//by Ankush Chavan