package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static void main(String[] args)throws IOException {
        //заполняем данными объекты
        Person person = new Person("Ivan", "Petrov", 22);
        Person mam = new Person("Mama", "Ivanova", 44);
        Person dad = new Person("Papa", "Ivanov", 46);
        Person child1 = new Person("Child1", "Ivanov", 12);
        Person child2 = new Person("Child2", "Ivanov", 16);
        person.setFather(dad);
        person.setMother(mam);
        List<Person> listChilds = new ArrayList<>();
        listChilds.add(child1);
        listChilds.add(child2);
        person.setChildren(listChilds);
        //выводим на экран данные объектов ДО записи
        System.out.println(person.firstName+" "+person.lastName+" "+person.age+" "+person.father.firstName+" "+person.mother.firstName+" "+person.children.get(0).firstName+" "+person.children.get(1).firstName);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/12345.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/12345.txt"));

        oos.writeObject(person);
        oos.close();

        try {
            Person newPerson = (Person)ois.readObject();
            ois.close();
            //выводим на экран данные объектов ПОСЛЕ записи. Сравниваем.
            System.out.println(newPerson.firstName+" "+newPerson.lastName+" "+newPerson.age+" "+newPerson.father.firstName+" "+newPerson.mother.firstName+" "+newPerson.children.get(0).firstName+" "+newPerson.children.get(1).firstName);

        } catch (ClassNotFoundException e){};
    }

    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        transient private Person mother;
        transient private Person father;
        transient private List<Person> children;

        public Person(){} //добавлен конструктор без параметров, тк присутствует конструктор с параметрами,
        // значит пустой не будет добавлен автоматом

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {


            out.writeObject(this.mother); //this добавлял для себя
            out.writeObject(this.father);
            out.writeObject(this.firstName);
            out.writeObject(this.lastName);
            out.writeInt(this.age);
            out.writeObject(this.children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            firstName = (String)in.readObject();
            lastName = (String)in.readObject();
            age = in.readInt();
            children = (List<Person>)in.readObject(); //в списке указали тип
        }
    }
}
