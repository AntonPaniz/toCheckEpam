package com.CheckingCollections.set;

import com.CheckingCollections.map.ObjectsForMap;
import com.CheckingCollections.utils.AnOtherObjectsForCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        AnOtherObjectsForCollections objectsForMap = new AnOtherObjectsForCollections("Abidal", 312);
                AnOtherObjectsForCollections objectsForMap2 = new AnOtherObjectsForCollections("tevez", 11);
        AnOtherObjectsForCollections objectsForMap3= new AnOtherObjectsForCollections("cro", 37);
        AnOtherObjectsForCollections o= new AnOtherObjectsForCollections("roberto", 18);
        AnOtherObjectsForCollections o1= new AnOtherObjectsForCollections("yoxan", 55);
        AnOtherObjectsForCollections o2= new AnOtherObjectsForCollections( "milito", 299);

        Set<AnOtherObjectsForCollections> setOk = new TreeSet<>();
        setOk.add(objectsForMap);
        setOk.add(objectsForMap2);
        setOk.add(objectsForMap3);
        setOk.add(o);
        setOk.add(o1);
        setOk.add(o2);
        setOk.add(o2);
        System.out.println(setOk.isEmpty());
        System.out.println(setOk.contains(o));

        Iterator<AnOtherObjectsForCollections> iterator = setOk.iterator();
        while (iterator.hasNext()){
                       System.out.println("common!>>> " + iterator.next());
        }
    }
}
