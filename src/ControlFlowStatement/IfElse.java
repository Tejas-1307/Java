package ControlFlowStatement;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any number:");
        int i= sc.nextInt();

//        if(i>0)
//        {
//            System.out.println("number is positive");
//        }
//        else {
//            System.out.println("number is negative");
//        }

        String str=i>0?"number is positive":"number is negative"; //Ternary operator or single line ifelse.


//
//        int a=20,b=301,c=40;
//
//        if(a>b && a>c)
//        {
//            System.out.println("a is greater");
//        }
//        else if (b>c)
//        {
//            System.out.println("b is greater");
//        }
//        else {
//            System.out.println("c is greater");
//        }
//

//        int x=30,y=60,z=90;
//
//        if(x+y+z==180)
//        {
//            System.out.println("it is a triangle");
//
//            if(x==90 || y==90 || z==90)
//            {
//                System.out.println("Right angled triangle");
//            }
//            else {
//                System.out.println("not right angled triangle");
//            }
//        }
//
//        else{
//            System.out.println("it is not triangle");
//        }
    }

}
