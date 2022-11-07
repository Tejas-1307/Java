package StringPractice;

public class Varargs {

    static int sum(int ...arr){

        int result=0;
        for(int a:arr){
           result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 and 3,4 :"+sum(2,3,4,5,6));
    }
}
