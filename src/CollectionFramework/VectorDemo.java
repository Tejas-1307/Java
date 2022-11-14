package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer>list = new Vector<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        System.out.println(list.capacity());
        System.out.println(list.contains(5));
        System.out.println(list.firstElement());
        System.out.println(list.lastElement());
        System.out.println(list.isEmpty());
        System.out.println(list.subList(1,5));
        System.out.println();

        Iterator<Integer> integer= list.iterator();

        while (integer.hasNext()){
            System.out.println(integer.next());
        }

        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
