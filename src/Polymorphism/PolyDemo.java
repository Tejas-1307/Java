package Polymorphism;
//polymorphism -> the ability to take one form to many form
//or
//one thing have many actions

 public class PolyDemo {


    /*
    method overloading => a class with multiple functions with same name but different number of arguments
    rule-1. changing number of arguments
         2. changing the functinion datatype.
     advantage -> it increase the readability of program
 */

    private int add(int a,int b){
        return a+b;
    }



    public static void main(String[] args) {
        PolyDemo obj= new PolyDemo();

        System.out.println(obj.add(6,9));
    }
}
