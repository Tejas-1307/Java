package Java8;

public class CapitalizeFirst {

    public static  String firstLetterCap(String str){
        return  str.replaceFirst(str.substring(0,1),String.valueOf(str.charAt(0)).toUpperCase());
    }

    public static void main(String[] args) {

        MyInterface6 m = CapitalizeFirst::firstLetterCap;
        System.out.println(m.capital("maharashtra"));
    }
}

interface MyInterface6{

    String capital(String str);
}