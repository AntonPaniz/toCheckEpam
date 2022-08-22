package com.CheckingCollections.filesWork.classPathTesting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class PathTesting {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {try {
            Files.write(
                    Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt"),
                    ("\nredmi").getBytes(),
                    StandardOpenOption.APPEND );
        } catch (IOException e) {
            e.printStackTrace();
        }        }
        try {
            Files.copy(Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt"),
                       Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Ozzy.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.move(Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Ozzy.txt"),
                    Paths.get("E:\\soft\\HoneyBonye for Sabbath\\geezer.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Files.deleteIfExists(Paths.get("E:\\soft\\HoneyBonye for Sabbath\\geezer.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        };
        Path path = Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt");
        for (int i = 0; i < 3; i++) {try {
            Files.write(
                    Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt"),
                    ("\nbkue").getBytes(),
                    StandardOpenOption.APPEND );
        } catch (IOException e) {
            e.printStackTrace();
        }        }
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
        System.out.println(path.getClass());
        try {
            System.out.println(Files.size(path));
            System.out.println(Files.getFileStore(path));
            System.out.println(Files.isHidden(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    byte [    ] bytes = Files.readAllBytes(path);
        for (byte tempByters: bytes
             ) {
            System.out.print(tempByters + "||" );
        }
    //    Files.write(path, "Led Zeppelin".getBytes());
        System.out.println();
        List<String> list = Files.readAllLines(Paths.get("E:\\soft\\HoneyBonye for Sabbath\\Sabbath.txt"));
        for (String li: list
             ) {
          //  System.out.print(li + " <> ");

            String chenged = new String(li);
            System.out.println(chenged );
        }
        System.out.println();
        System.out.println(Files.size(path));


        System.out.println("trying ReadAllLines>>>");
        List<String> toCheckReadAllLines = Files.readAllLines(path);
        for (String tempPrint: toCheckReadAllLines
             ) {
            System.out.println(toCheckReadAllLines);
break;
        }
        /*List<String> stringList = new ArrayList<String>();
        stringList.add("queen");
        stringList.add("moby");
        stringList.add("cream");
        for (String temp: stringList
        ) {
            System.out.println(temp);
            Files.write(path, stringList);
        }*/

    }
}
