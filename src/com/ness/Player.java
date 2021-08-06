package com.ness;

public class Player {

    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player KO");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
