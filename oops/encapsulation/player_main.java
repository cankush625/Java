package com.oops.encapsulation;

public class player_main {
    public static void main(String[] args){
        player Player = new player();
        Player.name = "Ankush";
        Player.health = 95;
        Player.weapon = "Sword";

        int damage = 10;
        Player.losehealth(damage);
        System.out.println("Remaining health = "+Player.remaining_health());
    }
}
