package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//ArratList Stores doublicate values
//ArrayList maintains insertion order
//Arraylist uses dynamic array to store the element
//Arraylist grow or shrink automatically by 50%
public class ArrayListDemo {
    public static  void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();


        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        list1.forEach(integer -> System.out.println(integer));

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);
        list2.add(8);

//        System.out.println(list1.addAll(list2));
//        System.out.println(list1.removeAll(list2));
//        System.out.println(list1.retainAll(list2));

//        System.out.println(list1.remove(Integer.valueOf(4)));
//        System.out.println(list1.remove(4));
//        System.out.println(list1.indexOf(4));
        System.out.println(list1.contains(5));
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1);

        List<Integer>list = new ArrayList<>();
        List<Integer>list3 = Arrays.asList(1,2,3,4,5);
        List<Integer>list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer>list5= new ArrayList<>(List.of(1,2,3,4));

        List<Integer>list6=new ArrayList<>(){{
            add(1);
            add(2);
        }};

        System.out.println(list);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);



    }
}
