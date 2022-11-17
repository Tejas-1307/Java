package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    int id;

    String name;

    String Address;

    public ComparatorDemo(int id, String name, String Address) {
        this.id = id;
        this.name = name;
        this.Address = Address;
    }

    public static void main(String[] args) {

        ComparatorDemo obj1 = new ComparatorDemo(30, "Tejas", "UK");
        ComparatorDemo obj2 = new ComparatorDemo(25, "Amit", "Dubai");
        ComparatorDemo obj3 = new ComparatorDemo(25, "Manish", "Usa");
        ComparatorDemo obj4 = new ComparatorDemo(40, "Jeevan", "Kothrud");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Comparator<ComparatorDemo> c1 = (ComparatorDemo o1, ComparatorDemo o2)-> {

                if (o1.id == o2.id) {
                    return 0;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return -1;
                }

        };

        Comparator<ComparatorDemo> c2 = (ComparatorDemo o1, ComparatorDemo o2)-> {

               return o1.name.compareTo(o2.name);

        };

        Collections.sort(list,c1.thenComparing(c2));

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.Address);
        });

    }

}

