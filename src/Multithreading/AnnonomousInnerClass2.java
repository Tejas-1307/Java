package Multithreading;

public class AnnonomousInnerClass2 {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("in show");
            }

            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        myInterface.show();
        myInterface.sum(8,12);
    }


    interface  MyInterface{

        void show();

        int sum(int a,int b);
    }
}
