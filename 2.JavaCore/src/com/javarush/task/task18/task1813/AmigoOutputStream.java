package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;

/*
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream outFile ;


    public AmigoOutputStream(FileOutputStream outFile) throws FileNotFoundException ,IOException
    {
        super(fileName);
        this.outFile = outFile;
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        outFile.write(b, off, len);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        outFile.write(b);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void write(int b) throws IOException
    {
        outFile.write(b);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void close() throws IOException
    {
        outFile.flush();
        outFile.write("JavaRush © All rights reserved.".getBytes());
        outFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException,IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
