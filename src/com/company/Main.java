package com.company;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person("James", 100);
    SuperHero hero = new SuperHero("Guy", 900, "SuperGuy");

    person1.display();
    hero.display();

    hero.attack(person1);
    hero.attack(person1);

    }
}
