package com.javarush.task.task20.task2004;

import java.io.*;

/* 
Читаем и пишем в файл статики
*/
class Solution {

    public static void main(String[] args) {
        try {

            File fileName = File.createTempFile("d:/1.txt", null);
            OutputStream outputStream = new FileOutputStream(fileName);
            InputStream inputStream = new FileInputStream(fileName);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            ClassWithStatic.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            System.out.println(ClassWithStatic.staticString);

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    static class ClassWithStatic {

        static String staticString = "it's test static string";
        int i=0;
        int j=0;

        void save(OutputStream outputStream) {
            PrintWriter printWriter = new PrintWriter(outputStream);
            String hasStaticString = (staticString != null) ? "yes" : "no";
            printWriter.println(hasStaticString);
            if ("yes".equals(hasStaticString)) {
                printWriter.println(staticString);
            }
            printWriter.println(this.i);
            printWriter.println(this.j);
            printWriter.close();
        }

        void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String hasStaticString = bufferedReader.readLine();
            if ("yes".equals(hasStaticString)) {
                staticString = bufferedReader.readLine();
            }
            this.i = Integer.parseInt(bufferedReader.readLine());
            this.j = Integer.parseInt(bufferedReader.readLine());
            bufferedReader.close();
        }
    }
}
