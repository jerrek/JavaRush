package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.address = null;
        this.color = "wonderfull";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "wonderfull";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.address = null;
        this.color = "wonderfull";
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 1;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 1;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
