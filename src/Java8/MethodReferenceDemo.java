package Java8;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        //methid reference to instant method

        MethodReferenceDemo obj = new MethodReferenceDemo();

        MyInterface3 myInterface3 = obj :: display;//refer method.

        myInterface3.show();//method call

    }

    public void display(){
        System.out.println(" in display");
    }
}
@FunctionalInterface
interface MyInterface3{

    void show();
}