package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BigestString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Satara");
        list.add("Pune");
        list.add("Kolhapur");
        list.add("Delhi");
        list.add("Vishakhapathnam");

        System.out.println(list);
        String biggest = list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("Biggest string is->"+biggest);
    }
}
