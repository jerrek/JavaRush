package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        InputStream reader = new FileInputStream(args[0]);
        OutputStream out = new FileOutputStream(args[1]);
        byte[] bytes = new byte[reader.available()];

        reader.read(bytes);
        Charset win1251 = Charset.forName("Windows-1251");
        Charset utf = Charset.forName("UTF-8");
        String str = new String(bytes, win1251);
        bytes = str.getBytes(utf);
        out.write(bytes);

        reader.close();
        out.close();

    }
}
