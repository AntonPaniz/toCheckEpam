package com.CheckingCollections.filesWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class LessonsTask {
    public static void main(String[] args) {
    String textToExplore = "love me do, betales rock's!!! 456 ghfgthgh";
    byte[] byteArray = new byte[textToExplore.length()];

        try(FileInputStream fileInputStream = new FileInputStream("Text.txt");
            FileOutputStream outputStream= new FileOutputStream("TextOut.txt"); ) {
            int read = fileInputStream.read(byteArray);
            System.out.println("size of our incoming file is>>> " + read + " bytes");

            String valueFromBytes = new String(byteArray);
            String up = valueFromBytes.toUpperCase();
            outputStream.write(up.getBytes(StandardCharsets.UTF_8));        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        {        try(FileOutputStream outputStream= new FileOutputStream("Text.txt");
        ) { outputStream.write(textToExplore.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println(e.getMessage());                    }
        }
}
}
