package com.company;

public class Person{
    private String name;
    private int health = 100;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void display(){
       System.out.println("Name: " + name + ", Health: " + health);
   }


}
