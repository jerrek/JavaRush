package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static Cat cat1 = new Cat();
    public static Cat cat2 = new Cat();
    public static Cat cat3 = new Cat();

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        if(iterator.hasNext())cats.remove(iterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static class Cat {
        String name;

        public Cat() {
            this.name = "fuck";
        }
    }
}
