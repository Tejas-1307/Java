package Java8;

import java.util.Arrays;
import java.util.List;

public class LambadaExperation {

    public static void main(String[] args) {

        MyInterface m = () -> {

            System.out.println("in lambada");
        };
        m.show();

        MyInterface1 m1 = (i,j) -> {
            System.out.println(i+j);
        };
        m1.add(4,4);

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(integer -> {
            System.out.println(integer);
        });
    }

}
       @FunctionalInterface
      interface MyInterface{
          void show();
      }

      @FunctionalInterface
      interface MyInterface1{
        void add(int i,int j);
}


