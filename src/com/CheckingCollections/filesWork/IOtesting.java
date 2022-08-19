package com.CheckingCollections.filesWork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOtesting {
    public static void main(String[] args) {
        try(FileWriter out = new FileWriter("Text.txt");) {

            BufferedWriter bufferedWriter = new BufferedWriter(out);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println("What about heavy metal new wave?");
            printWriter.println("Samson, sounds good");
            printWriter.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        try {
            FileWriter out1 = new FileWriter("Text1.txt");
            BufferedWriter bufferedWriter1 = new BufferedWriter(out1);
            PrintWriter printWriter1 = new PrintWriter(bufferedWriter1);
            printWriter1.print("Led ");
            printWriter1.println("Scake мана мана");
            printWriter1.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
