package CollectionFramework;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ListOfMap {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Tejas",7);
        map.put("Amit",8);
        map.put("Manish",9);

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Dom",10);
        map1.put("Jon",11);
        map1.put("Peter",12);

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Hobb's",13);
        map2.put("miya",14);
        map2.put("Letty",15);

//        List<Map<String,Integer>> list = new ArrayList<>();
//        list.add(map);
//        list.add(map1);
//        list.add(map2);

        List<Map<String,Integer>> list = Arrays.asList(map,map1,map2);


        list.forEach((l)->{
            l.forEach((k,v)->{
            System.out.println(k+" "+v);
            });
        });
    }
}
