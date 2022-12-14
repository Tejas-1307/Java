package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo implements Comparable<EmployeeDemo> {

    int id;

    String name;

    String Address;

    public EmployeeDemo(int id,String name,String Address) {
        this.id = id;
        this.name=name;
        this.Address=Address;
    }

    public static void main(String[] args) {

        EmployeeDemo obj1 = new EmployeeDemo(30,"Tejas","UK");
        EmployeeDemo obj2 = new EmployeeDemo(25,"Amit","Dubai");
        EmployeeDemo obj3 = new EmployeeDemo(35,"Manish","Usa");
        EmployeeDemo obj4 = new EmployeeDemo(40,"Jeevan","Kothrud");

        List<EmployeeDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Collections.sort(list);

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.Address);
        });

    }

    @Override
    public int compareTo(EmployeeDemo o) {
        return this.name.compareTo(o.name);
    }


//    @Override
//    public int compareTo(EmployeeDemo o) {
//
//        if (this.id==o.id){
//            return 0;
//        } else if (this.id > o.id) {
//            return 1;
//
//        }else {
//            return -1;
//        }
//
//    }
}
