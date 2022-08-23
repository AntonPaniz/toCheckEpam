package com.CheckingCollections.checkFilesFinally;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckFinally {
    public static void main(String[] args) throws IOException {
        String str = "Kvetka paprac, kvetka shchacya";
        FileWriter fileWriter1 = null;
        BufferedWriter bufferedWriter = null;
        FileReader fileReader1 = null;
        BufferedReader bufferedReader1 = null;
        fileWriter1 = new FileWriter("E:\\soft\\HoneyBonye for Sabbath\\Final Sabbat.txt");
        bufferedWriter = new BufferedWriter(fileWriter1);
        bufferedWriter.write(str);
        bufferedWriter.close();
        System.out.println(bufferedWriter.getClass());
        fileReader1 = new FileReader("E:\\soft\\HoneyBonye for Sabbath\\Final Sabbat.txt");
        bufferedReader1 = new BufferedReader(fileReader1);
        String str1;
        int igi = 0;
        char[] chars = new char[200];
        while ((/*(str1 = bufferedReader1.readLine())!=null){
                System.out.println(str1);
                    (igi=bufferedReader1.read())!=-1){
                System.out.print((char) igi);*/
                igi = bufferedReader1.read(chars)) != -1) {
           /* for (int i = 0; i < chars.length; i++) {
                if (Character.isAlphabetic(chars[i]) || Character.isWhitespace(chars[i])) {
                    System.out.print(chars[i]);
                }
            }*/
            System.out.println((char) igi);
            ;
        }
        System.out.println("fasofasjdoisadjsao>>>>>>>>>>>>..");
        FileInputStream fileInputStream = new FileInputStream("E:\\soft\\HoneyBonye for Sabbath\\Final Sabbat.txt");
        int bla = 0;
        byte[] bytes2 = new byte[500];
        while ((fileInputStream.read(bytes2) != -1)) {
            for (int i = 0; i < bytes2.length; i++) {
                if (bytes2[i] == 0) {
                    break;
                }
                System.out.println(bytes2[i]);
            }

        }
    }
}



