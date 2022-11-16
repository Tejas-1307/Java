package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Satara",007);
        map.put("Pune",111);
        map.put("Mumbai",6688);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        System.out.println();

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        System.out.println();

        for (Map.Entry<String,Integer> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
