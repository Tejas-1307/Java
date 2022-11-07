package ControlFlowStatement;

import java.util.Scanner;

public class YesNo {
    public static void main(String[] args) {

        int num,sum=0;
        char choice;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter any number");
            num= sc.nextInt();
            sum=num+sum;

            System.out.println("Do you want to continue");
            choice=sc.next().charAt(0);
        }while (choice=='Y' || choice=='y');

        System.out.println(sum);

    }
}
