package ControlFlowStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        //traditional for loop
//
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for (int i= arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }

//        int arr[]={1,2,5,6,3,2};
//
//        System.out.println("odd numbers");
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]%2! == 0)
//            {
//                System.out.println(arr[i]);
//            }
//        }
//
//        System.out.println("even number");
//        for (int i=0;i< args.length;i++)
//        {
//            if(arr[i]%2==0)
//            {
//                System.out.println(arr[i]);
//            }
//
//        }

        //enhanced for loop
//        for (int i:arr) {
//            System.out.println(i);
//
//        }

//        ForEach

//        List<Integer> list=new ArrayList<>()


//        List<Integer> list= Arrays.asList(1,2,3,4,5);

//        Arrays.asList(1,2,3,4,5).forEach(System.out::println); //one line

//        list.forEach(s->{
//            System.out.println(s);
//        });

//        list.forEach(System.out::println);
    }
}
