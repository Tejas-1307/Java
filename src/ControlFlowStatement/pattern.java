package ControlFlowStatement;

public class pattern {
    public static void main(String[] args) {

//        for (int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//            i
//       j    * * * *
//            *     *
//            *     *
//            * * * *
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==2 && j==2 || i==2 && j==3 || i==3 && j==2 || i==3 && j==3)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
