package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    String name = "Barsik";
    int age = 6;

    public static void main(String[] args) {


    }

    // G/S for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // G/S for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
