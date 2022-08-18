package com.CheckingCollections.utils;

import com.CheckingCollections.ObjectsForCollections;

import java.util.ArrayList;
import java.util.List;

public class ToPrint {
    public static void printing(List<ObjectsForCollections> list)
    {
        for (ObjectsForCollections tempIteratorValue: list
             ) {
            System.out.println(tempIteratorValue);

        }
    }
}
