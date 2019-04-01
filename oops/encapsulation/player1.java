package com.oops.encapsulation;

public class player1 {
    private String name; //Variables in encapsulation have private access specifier
    private int health;
    private String weapon;
    //We can change the variable names anytime without affecting the rest of the code by using encapsulation

    public player1(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player is knocked out!");
        }
    }

    public int getHealth() {
        return health;
    }
}
