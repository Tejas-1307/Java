package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericDemo<String> genericDemo = new GenericDemo<>();
        genericDemo.setT("Tejas");
        System.out.println(genericDemo.getT());

        GenericDemo<Integer>genericDemo1= new GenericDemo<>();
        genericDemo1.setT(1);
        System.out.println(genericDemo1.getT());

        List list  = new ArrayList<>();
        list.add("obj");

        String  s= (String) list.get(0);


    }
}
