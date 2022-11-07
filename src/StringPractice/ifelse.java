package StringPractice;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any number");
        int age= sc.nextInt();

        if(age>18 && age<65){
            System.out.println("you are drive car");
        }
        else {
            System.out.println("you can not drive car");
        }

    }
}
