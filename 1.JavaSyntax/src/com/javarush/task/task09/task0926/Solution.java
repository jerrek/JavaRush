package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        int[] temp = {5, 2 ,4, 7, 0};
        ArrayList<int[]> list = new ArrayList<int[]>();

        try {
            for (int i = 0; i < temp.length; i++) {
                int[] array = new int[temp[i]];
                for (int j = 0; j < temp[i]; j++) {
                    array[i] = 2;
                }
                list.add(array);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return (ArrayList<int[]>) list;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}