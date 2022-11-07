package Multithreading;

public class AnnonomousInnerClass {
    public static void main(String[] args) {

        MyInterface myInterface = ()->{ //using lamdaexpresion
                System.out.println("in Show");

        };
        myInterface.show();
    }



    interface MyInterface{
        void show();
    }
}
