package CollectionFramework;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,Integer>treeMap = new TreeMap<>();

        treeMap.put(1,10);
        treeMap.put(2,20);
        treeMap.put(3,30);
        treeMap.put(4,40);
        treeMap.put(5,50);

        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.get(4));
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.subMap(2,5));
        System.out.println(treeMap.higherEntry(4));
        System.out.println(treeMap.headMap(2,true));
    }
}
