package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class Employee {

    int id;

    String name;

    String Address;

    int age;

    String CompanyName;

    public Employee(int id,String name,String Address,int age,String CompanyName) {
        this.id = id;
        this.name=name;
        this.Address=Address;
        this.age=age;
        this.CompanyName=CompanyName;
    }

    public static void main(String[] args) {

        Employee obj1 = new Employee(1,"Tejas","Pune",20,"Google");
        Employee obj2 = new Employee(1,"Amit","Pune",20,"Google");
        Employee obj3 = new Employee(1,"Manish","Pune",22,"Google");
        Employee obj4 = new Employee(1,"Jeevan","Pune",20,"AppayStack");

        List<Employee> list = new LinkedList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        list.forEach(Employee ->{
            System.out.println(Employee.id+" "+Employee.name+" "+Employee.Address+" "+Employee.age+" "+Employee.CompanyName);
        });

    }
}
