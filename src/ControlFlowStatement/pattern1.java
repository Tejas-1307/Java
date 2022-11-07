package ControlFlowStatement;

public class pattern1 {
    public static void main(String[] args) {

//    for(int i=1;i<=4;i++)
//    {
//        for (int j=1;j<=i;j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }

    /*output=>  *
                * *
    *           * * *
    *           * * * *
    */

//        for(int i=1;i<=4;i++)
//        {
//            for(int j=4;j>=i;j--) {
//                System.out.print("*");
//            }
//        System.out.println();
//        }




//        for(int i=1;i<=5;i++)
//        {
//            for(int j=i;j>=1;j--)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//


        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /*
        *   1
            1 2
            1 2 3
            1 2 3 4

         */

}
}

