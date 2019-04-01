package com.oops.inheritance;

public class animal_main {
    public static void main(String[] args){
        animal animal1 = new animal("Animal", 1, 4, 35);

        dog dog1 = new dog("Shamu", 40, 2, "royal_bark", 1);
        dog1.eat();
        dog1.move();
        dog1.run();
    }
}
