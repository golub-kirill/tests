package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        //Долго пытался понять условие :(

        strength = weight * age;
        anotherCat.strength = anotherCat.weight * anotherCat.age;
        return (strength > anotherCat.strength);

    }
}
