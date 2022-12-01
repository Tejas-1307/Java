package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(50,55,145,852,2,3);

        list.stream().sorted().forEach(System.out::println);
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//reverse

        System.out.println();

        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }

}
