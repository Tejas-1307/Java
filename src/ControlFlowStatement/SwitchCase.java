package ControlFlowStatement;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date : ");
        int day = sc.nextInt();
        String nextnumber;

        switch (day){
            case 1,8,15,22,29:
                System.out.println("Sunday");
                System.out.println("Enter Another String");
                nextnumber= sc.next();

                switch (nextnumber){
                    case "One":
                        System.out.println("1");
                        break;
                    case "Two":
                        System.out.println("2");
                        break;
                }

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("wrong choise");
        }
    }
}

//reverse
//duplicate
//even odd
//default case
