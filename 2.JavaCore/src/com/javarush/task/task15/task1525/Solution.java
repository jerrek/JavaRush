package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        String f=Statics.FILE_NAME;
        try {
            FileReader fileReader=new FileReader(f);
            BufferedReader reader=new BufferedReader(fileReader);
            String str;
            while((str=reader.readLine())!=null){
                lines.add(str);
            }
            reader.close();}catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws Exception{

        System.out.println(lines);
    }
}
