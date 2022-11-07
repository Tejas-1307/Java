package Exceptionhanding;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) throws Exception {

//        int age=17;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        age= sc.nextInt();
//
        if(age>18){
            System.out.println("you can vote");
        }
        else {
            throw new Exception("you can not vote");
        }


        //using try catch

//        if(age>18){
//            System.out.println("you can vote");
//        }
//        else {
//            try {
//                throw new Exception("you can not vote");
//            }catch (Exception a){
//                System.out.println(a);
//            }
//        }
    }
}


/*
*                       throw                                                       throws
*      1.to throw the exception explicitly                              1. to declare exception
*
*      2.throw is used in method                                        2.throws is used with method signature
*
*      3.throw is followed by instance                                  3.throws is followed by classes
*
*      4.you can throw only single exception                            4.you can delare multiple exception
 */
