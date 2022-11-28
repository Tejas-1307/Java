package Java8;

public class MethodRefStatic {

    public static void main(String[] args) {
        //method ref to static method

        MyInterface4 myInterface4 = MethodRefStatic::display ;
        myInterface4.Show();

        }
            public static void display() {
                System.out.println("in display");//call
            }

    }


interface MyInterface4{

    void Show();
}