package com.company;

public class SuperHero extends Person {
    private String alias;
    private int damage = 25;


    public SuperHero(String name, int health, String alias) {
        super(name, health);
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }



    @Override
    void display() {
        super.display();
        System.out.println("Hero Name: " + getAlias());
    }

    public void attack(Person a){
        int newHealth = a.getHealth() - damage;
        a.setHealth(newHealth);
        System.out.println(alias + " attacked " + a.getName());
        System.out.println("There health is at " + a.getHealth());
    }
}
