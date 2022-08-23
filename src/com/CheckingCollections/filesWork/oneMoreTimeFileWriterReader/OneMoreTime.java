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
            int forPrintCast = 0;
            while ((forPrintCast = reader.read())!= -1){
                System.out.print((char)forPrintCast);

              /*  System.out.println("anotherWay!>>!");
                char  [] chars = new char[500];
                while (reader.read(chars)!= -1){
                    System.out.println(chars);*/
                }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("print with help from bufferReader>>>");
    int cointForPrint = 0;
        try{Reader reader = new FileReader("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((cointForPrint = bufferedReader.read())!= -1) {
            //System.out.print((char) cointForPrint );
            System.out.println(bufferedReader.readLine() + (char)cointForPrint + " || " );
        }}catch (IOException e){
            System.err.print(e.getMessage());
    }
        Writer writer = null;
        BufferedWriter bufferedWriter =null;
        Reader reader = null;
        BufferedReader bufferedReader = null;
        char [] bytes = new char[500];
        int valueForPr = 0;
        try {
            writer = new FileWriter("E:\\soft\\HoneyBonye for Sabbath\\abath.txt");
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("ozzy");
            //bufferedWriter.newLine();
            bufferedWriter.write("\ntommy");
         //   bufferedWriter.newLine();
            bufferedWriter.write("\nHey man!");
            bufferedWriter.close();
            reader = new FileReader("E:\\soft\\HoneyBonye for Sabbath\\abath.txt");
            bufferedReader = new BufferedReader(reader);
           String liik;
          while ((liik =  bufferedReader.readLine())!= null){
            System.out.println(liik + "\n");}



        } catch (IOException e) {
            e.printStackTrace();
        }


}}
