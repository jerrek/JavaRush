package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Кирилл", true,42);
        Human ded2 = new Human("Marvin", true,42);
        Human babka1 = new Human("Настя", false,42);
        Human babka2 = new Human("Катя", false,42);
        Human papa = new Human("Zafod", true, 22, ded1, babka1);
        Human mama = new Human("Trillian", false, 22, ded2, babka2);
        Human doch1 = new Human("Random1", false, 12, papa, mama);
        Human doch2 = new Human("Random2", false, 12, papa, mama);
        Human doch3 = new Human("Random3", false, 12, papa, mama);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(doch1);
        System.out.println(doch2);
        System.out.println(doch3);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















