package Java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
       Student student = new Student(1,null,"pune");
       if (student.name != null){
           System.out.println(student.name.toUpperCase());
       }else {
           System.out.println("is Null");
       }

//        Optional<String> s1 = Optional.empty();
//        System.out.println(s1.get());

//        Optional<String> s2 = Optional.of(student.name);
//        System.out.println(s2);

//        Optional<String> s3 = Optional.ofNullable(student.name);
//        if (s3.isPresent()){
//        System.out.println(s3.get());
//        }

//        Optional<String> s4 = Optional.ofNullable(student.name);
//        System.out.println(s4.orElseGet(()->"student is null"));
//
        Optional<String> s5 = Optional.ofNullable(student.name);
        System.out.println(s5.orElseThrow(()-> new Exception()));

        Optional<String> s6 = Optional.ofNullable(student.name);
        System.out.println(s6.orElseThrow());


    }
}

class  Student{
    int id ;

    String name;

    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
