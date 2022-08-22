package com.CheckingCollections.filesWork.classFilesTest;

import java.io.File;
import java.io.IOException;

public class ClassFilesTesting {
    public static void main(String[] args) {
        File file = new File("E:\\testingclassFille");
        if(file.mkdir()){
            System.out.println("we created new folder");
        } else{
            System.out.println("shit happens!");
        }
        System.out.println(file.delete());
        File fSecondCheck = new File("E:\\soft\\HoneyBonye");
        fSecondCheck.mkdir();
        System.out.println(fSecondCheck.exists());

        File txtFile = new File("E:\\soft\\HoneyBonye\\TestingClassFile.txt");
        try {
            System.out.println(txtFile.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(txtFile.exists() + "  check by myself");
        File blackSabbath = new File("E:\\soft\\HoneyBonye for Sabbath");
        blackSabbath.mkdir();
        File sabbath = new File("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt");
        try {
            sabbath.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sabbath.renameTo(txtFile));
        System.out.println(sabbath.getPath());
        System.out.println(sabbath.getParent());
        System.out.println(sabbath.getAbsoluteFile());
    }
}
