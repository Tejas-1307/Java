package Exceptionhanding;

public class Exceptiondemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;


        try {
            k = i / j;
            try {

                String str = null;
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Null pointer ==>" + e);
            }


            System.out.println("in try block");
        }
            catch(RuntimeException e){
                System.out.println("Runtime=>"+e);
            }
        finally {
            System.out.println("Process finished");
        }
            System.out.println(k);
            System.out.println("hii");
        }
    }

