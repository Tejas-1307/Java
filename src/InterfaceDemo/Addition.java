package InterfaceDemo;

public class Addition implements Add,sub {

    @Override
    public int add(int i, int j) {//implementation of method
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i/j);
        System.out.println(i*j);
        return 0;
    }
    @Override
    public int sub(int i, int j) {
        System.out.println(i-j);
        return 0;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(6,4);

        obj.sub(5,6);
    }


}


/**
 *   abstrsct class                                                                 interface
 *
 *   1.we declare abstract class using abstract keyword                        we use interface
 *
 *   2.we abstract + non abstract method in abstract class                     only abstract
 *
 *   3.private,protected,default,public variable                               public abstract by default
 *
 *   4.we can extends another class to abstract class                           we can extends another interface
 *
 *   5.partial abstraction                                                      100% abstraction
 */
