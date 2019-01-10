package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            all.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < all.size(); i++) {
            int a = all.get(i);
            if (a % 3 == 0) {
                three.add(a);
                if (a % 2 == 0) two.add(a);
            } else if (a % 2 == 0) two.add(a);
            else other.add(a);
        }
        printList(three);
        printList(two);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
