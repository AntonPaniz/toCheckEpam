package com.CheckingCollections.filesWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        byte [] buffer = new byte[100];
        try {
            FileInputStream fileInputStream = new FileInputStream ("text1.txt");
           int readik = fileInputStream.read(buffer);
            System.out.println(readik);
            System.out.println(new String(buffer));
        } catch (IOException e) {
          System.err.println(e.getMessage());
        }
        for (byte tenpByte: buffer
             ) {
            System.out.print(tenpByte + " ||| ");

        }
    }


}
