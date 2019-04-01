package com.oops.encapsulation;

public class player {
    public String name;
    public int health;
    public String weapon;

    public void losehealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player is knocked out");
        }
    }

    public int remaining_health(){
        return this.health;
    }
}
