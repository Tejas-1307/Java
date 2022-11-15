package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

//set doesn't maintain the insertion order
//set doesn't store doublicate values
public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(30);
        set.add(40);
        System.out.println(set);

    }
}
