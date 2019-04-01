package com.oops.encapsulation;

public class player1_main {
    public static void main(String[] args){
        player1 player = new player1("Ankush", 95, "Sword");
        System.out.println("Initial health is "+player.getHealth());
    }
}
