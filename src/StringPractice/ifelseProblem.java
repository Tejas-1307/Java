package StringPractice;

import java.util.Scanner;

public class ifelseProblem {
    public static void main(String[] args) {
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Physics marks");
//        m1=sc.nextByte();
//
//        System.out.println("Enter your Chemistry marks");
//        m2=sc.nextByte();
//
//        System.out.println("Enter your Mathimatics marks");
//        m3=sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("your Persentage is:"+avg);
//
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("congratulation your are Selected");
//        }
//        else {
//            System.out.println("Better luck next time");
//        }

//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Year!!");
//        year=sc.nextInt();
//
//        if((year % 4==0)&&(year%100!=0)||(year%400==0)){
//            System.out.println("year is leap year");
//        }
//        else {
//            System.out.println("year is not leap");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your website name:");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("Orangnizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("indian website");
        }
        else {
            System.out.println("incorrect web");
        }

    }
}
