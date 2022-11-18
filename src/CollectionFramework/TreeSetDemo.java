package CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer>treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(90);
        treeSet.add(70);
        treeSet.add(100);
        treeSet.add(10);

        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.ceiling(15));
        System.out.println(treeSet.tailSet(90));
        System.out.println(treeSet.floor(15));
        System.out.println(treeSet.lower(101));
        System.out.println(treeSet.higher(70));
        System.out.println(treeSet.headSet(70,true));
        System.out.println(treeSet.tailSet(70,false));

    }
}
