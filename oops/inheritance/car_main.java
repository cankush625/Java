package com.oops.inheritance;

public class car_main {
    public static void main(String[] args){
        car car1 = new car("Four_wheeler", "LMW", 1, 4);

        lamborghini aventador = new lamborghini("Aventador", "AV8767", 2, 160, "Green");
        aventador.run();
        aventador.sound();
    }
}
