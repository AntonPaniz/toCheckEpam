package com.CheckingCollections;

import com.CheckingCollections.utils.AnOtherObjectsForCollections;
import com.CheckingCollections.utils.ToPrint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ObjectsForCollections firstObj = new ObjectsForCollections();
        ObjectsForCollections secObj = new ObjectsForCollections("hunny", "bunny", 1984);
        ObjectsForCollections thirdObj = new ObjectsForCollections();
        ObjectsForCollections fouthObj = new ObjectsForCollections();

        LinkedList<ObjectsForCollections> mycoll = new LinkedList<ObjectsForCollections>(){{
            add(firstObj);
            add(secObj);
            add(fouthObj);
        }};
        mycoll.add(0, thirdObj);
        System.out.println("size of colections is>> " + mycoll.size());
       ToPrint.printing(mycoll);
        System.out.println("index of secObj is >>> " + mycoll.indexOf(secObj));

        System.out.println("using implementation of Deque>> " + mycoll.getFirst());

        Iterator<ObjectsForCollections> iterator = mycoll.iterator();
        while (iterator.hasNext()){
            iterator.next();
           // iterator.remove();
        };
        System.out.println("coll after Iterator");
        ToPrint.printing(mycoll);

      /*  List<String> collWithoutClass = new ArrayList<>();
       collWithoutClass.add("manaMana");
       collWithoutClass.add("dell");
       collWithoutClass.add("tut");
       collWithoutClass.add(1, "daf");
        for (String tempList: collWithoutClass
             ) {
            System.out.println(tempList);

        }
        for (int i = 0; i < collWithoutClass.size(); i++) {
            System.out.println("here we go>> " + collWithoutClass.get(i));

        }
        String aString = collWithoutClass.get(2);
        System.out.println(aString);

        ObjectsForCollections objectsForCollectionsToCheckGet = mycoll.get(2);
        System.out.println(objectsForCollectionsToCheckGet);

        ObjectsForCollections beforeRemove = mycoll.get(2);
        System.out.println("before remove>> " + beforeRemove);
        boolean remove = mycoll.remove(secObj);

        System.out.println(remove);

        ToPrint.printing(mycoll);

        ObjectsForCollections afterRemove = mycoll.get(2);
        System.out.println("after remove>> " + afterRemove);
*/
    }
}
