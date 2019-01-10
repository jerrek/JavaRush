package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human chield1 = new Human("lol",true,12,new ArrayList<>());
        Human chield2 = new Human("Kek",true,12, new ArrayList<>());
        Human chield3 = new Human("Cheburek",true,12, new ArrayList<>());
        ArrayList<Human> childreNext = new ArrayList<>();
        childreNext.add(chield1);
        childreNext.add(chield2);
        childreNext.add(chield3);
        Human papa = new Human("Kak",true,22, childreNext);
        Human mama = new Human("Nikak",true,22,childreNext );
        ArrayList<Human> childrenPapa = new ArrayList<>();
        childrenPapa.add(papa);
        ArrayList<Human> childrenMama = new ArrayList<>();
        childrenMama.add(mama);
        Human ded1 = new Human("Kok",true,42, childrenPapa);
        Human ded2 = new Human("Kek",true,42, childrenMama);
        Human babka1 = new Human("Kuk",true,42, childrenPapa);
        Human babka2 = new Human("Kik",true,42, childrenMama);

        System.out.println(chield1.toString());
        System.out.println(chield2.toString());
        System.out.println(chield3.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
