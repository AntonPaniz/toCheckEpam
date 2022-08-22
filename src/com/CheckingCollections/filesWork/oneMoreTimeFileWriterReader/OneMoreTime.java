package com.CheckingCollections.filesWork.oneMoreTimeFileWriterReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class OneMoreTime {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt");
            int forPrintCast = 1;
            while ((forPrintCast= reader.read())!= -1){
                System.out.print((char)forPrintCast);

                System.out.println("anotherWay!>>!");
                char  [] chars = new char[500];
                while (reader.read(chars)!= -1){
                    System.out.println(chars);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("print with help from bufferReader>>>");

        try{Reader reader = new FileReader("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (bufferedReader.read()!= -1){
            System.out.println(bufferedReader.readLine());}

        }catch (IOException e){
            System.err.println(e.getMessage());


    }
        Writer writer = null;
        BufferedWriter bufferedWriter =null;
        try {
            writer = new FileWriter("E:\\soft\\HoneyBonye for Sabbath\\abath.txt");
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("ozzy\n");
            bufferedWriter.newLine();
            bufferedWriter.write("  \ntommy");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


}}
