package com.CheckingCollections.filesWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FromWhiteRabbit {
    public static void main(String[] args) throws IOException {
        int countValueForWhileLoopToPrint = 0;
        int countValueForWhileLoopToPrint2 = 0;
            FileInputStream firstVersion = new FileInputStream("E:/abc.txt");
            while ((countValueForWhileLoopToPrint=firstVersion.read())!=-1);
        System.out.println((char) countValueForWhileLoopToPrint);

        }}
