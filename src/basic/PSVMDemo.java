package basic;

public class PSVMDemo {

    int i = 10;

    public static void main(int i) {
        System.out.println("in show method" + i);

    }



    static public void main(String[] args){

//        *
//        * public => is access modifier and jvm can access form outside.
//          * static => without creating object of class jvm can access this method.
//          * void => it return nothing.
//          * main => main is identifier and entry point of java program.
//          * String[] => it is command line arguments.
//          * args => variable name.


        PSVMDemo obj = new PSVMDemo();

        System.out.println(obj.i);
//        show(3);

    }
}
