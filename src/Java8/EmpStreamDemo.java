package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmpStreamDemo {
    int id;

    String name;

    Double salary;

    public EmpStreamDemo(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpStreamDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        List<EmpStreamDemo>list = new ArrayList<>();
        list.add(new EmpStreamDemo(1,"tejas",800000.0));
        list.add(new EmpStreamDemo(2,"Amit",900000.0));
        list.add(new EmpStreamDemo(3,"jeevan",9000.0));
        list.add(new EmpStreamDemo(4,"manish",8000.0));

//        Predicate<Integer>predicate=(p)->p>10000.0;

        list.stream().filter(empStreamDemo -> empStreamDemo.salary>=10000.0).forEach(System.out::println);
    }
}
