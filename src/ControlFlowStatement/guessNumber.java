package ControlFlowStatement;

import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {

    int num = (int) (100*Math.random())+1;

    int guessNumber = 0;

    Scanner sc = new Scanner(System.in);

        do {
        System.out.println("enter the number");
        guessNumber= sc.nextInt();

        if(num>guessNumber)
        {
            System.out.println("number is greater");
        } else if (num<guessNumber) {
            System.out.println("number is less");
        }
        else {
            System.out.println("you guess correct");
        }
    }while (num != guessNumber);

}

}

