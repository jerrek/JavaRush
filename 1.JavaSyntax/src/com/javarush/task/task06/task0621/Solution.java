package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cat ded = new Cat(reader.readLine());
        Cat babka = new Cat(reader.readLine());
        Cat papa = new Cat(reader.readLine(), null, ded);
        Cat mama = new Cat(reader.readLine(), babka, null);
        Cat sin = new Cat(reader.readLine(), mama, papa);
        Cat doch = new Cat(reader.readLine(), mama, papa);
        System.out.println(ded);
        System.out.println(babka);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(sin);
        System.out.println(doch);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parentParent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parentParent) {
            this.name = name;
            this.parent = parent;
            this.parentParent = parentParent;
        }

        @Override
        public String toString() {
            if (parent == null && parentParent == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (parent != null && parentParent == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father ";
            else if (parent == null && parentParent != null)
                return "Cat name is " + name + ", no mother, father is " + parentParent.name;
            else return "Cat name is " + name + ", mother is " + parent.name + ", father is " + parentParent.name;
        }
    }

}
