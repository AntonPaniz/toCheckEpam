package com.CheckingCollections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        ObjectsForMap objectsForMap = new ObjectsForMap(22, "Abidal", "France");
        ObjectsForMap objectsForMap2 = new ObjectsForMap(33, "tevez", "Argentiba");
        ObjectsForMap objectsForMap3= new ObjectsForMap(222, "cro", "portugal");
        ObjectsForMap o= new ObjectsForMap(2893, "roberto", "fener");
        ObjectsForMap o1= new ObjectsForMap(14, "yoxan", "ayaks");
        ObjectsForMap o2= new ObjectsForMap(15, "milito", "malaga");


        Map<Integer, ObjectsForMap> mapEx = new TreeMap<>();
        mapEx.put(objectsForMap.getNumber(), objectsForMap);
        mapEx.put(objectsForMap2.getNumber(), objectsForMap2);
        mapEx.put(objectsForMap3.getNumber(), objectsForMap3);
        mapEx.putIfAbsent(o.getNumber(), o);
        mapEx.putIfAbsent(o1.getNumber(), o1);
        mapEx.putIfAbsent(o2.getNumber(), o2);

        for (Map.Entry<Integer, ObjectsForMap> printIteratot: mapEx.entrySet()) {
           System.out.println("my way>>> " + printIteratot);
          //  System.out.println(printIteratot.getKey() + " !=! " + printIteratot.getValue());

        }
    }
}
