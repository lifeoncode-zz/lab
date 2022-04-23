package me.lifeoncode;

public class Player {
    private int health;
    
    public void getHealth() {
        System.out.println("Player health: "+this.health);
    }

    public void setHealth(int x) {
        if (x > 100) {
            System.out.println("error");
        }else {
            this.health = x;
        }
    }
}
