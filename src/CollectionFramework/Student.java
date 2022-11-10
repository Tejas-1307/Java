package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Student {

    int id;

    String name;

    String Address;

    public Student(int id,String name,String Address){

        this.id=id;
        this.name=name;
        this.Address=Address;
    }

    public static void main(String[] args) {
        Student obj = new Student(1,"Tejas","Satara");
        Student obj1 = new Student(2,"Amit","Satara");
        Student obj2 = new Student(3,"Manish","Satara");

        List<Student>list=new ArrayList<Student>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            Student st= (Student) itr.next();
            System.out.println(st.id+" "+st.name+" "+st.Address);
        }

    }

}


