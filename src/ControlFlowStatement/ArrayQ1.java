package ControlFlowStatement;

import java.util.Scanner;

public class ArrayQ1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value");
            arr[i] = sc.nextInt();
        }

        String operation;
        System.out.println("enter operetion - reverse,duplicate,evenOdd");
        operation = sc.next();

        switch (operation) {
            case "duplicate":
                duplicate(arr);
                break;

            case "reverse":
                reverse(arr);
                break;

            case "evenOdd":
                evenOdd(arr);
                break;

            default:
                System.out.println("wrong choise");
        }
    }

    private static void duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }

    private static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    private static void evenOdd(int[] arr) {
        System.out.println("even number");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("odd number");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }


        }

    }
}
