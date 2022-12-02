package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> in = list.stream().reduce((a ,b)->a+b);//sum
        System.out.println(in.get());

        Optional<Integer>in2 = list.stream().reduce((a,b)-> (a>b)?a:b); //max
        System.out.println(in2.get());

        Optional<Integer> in3 = list.stream().reduce((a,b) -> (a<b)?a:b);//min
        System.out.println(in3.get());

        List<String> list1 = Arrays.asList("Rahul","Mahesh","Abhishek","John");//small String.
        Optional<String> str = list1.stream().reduce((a,b)->(a.length()<b.length())?a:b);
        System.out.println(str.get());

    }
}
