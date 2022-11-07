package Constructor;

/*
*constructor -> is special type of function which invoke automatically when we create object of class
*
* rules -> 1.class name and function name should be same.
*          2.there is no return type to constructor.
*          3.we cannot declare constructor as abstract,final,static,synchronized.
*
* types -> 1.default
*          2.parameter constructor.
*
* use -> it initialize variable to their default values.
*
 */

public class ConstructorDemo {

    public  ConstructorDemo(){  //Default constructor

        System.out.println("in constructor");
    }

    public ConstructorDemo(int i){   //parameter constructor

        System.out.println("in paremeter:"+i);
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();

        ConstructorDemo obj1 = new ConstructorDemo(2);
    }
}
