package StringDemo;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Pune";
        String str1 = "Pune";
        String str3 = "Kolhapur";

        String str2 = new String("Mumbai");

//        str.concat(str1);
//        System.out.println(str);

        String s = str.concat(str1);
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.lastIndexOf("P"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n",3));
        System.out.println(str3.substring(5,8));
        System.out.println(str3.charAt(7));
        System.out.println(str3.contains("k"));
        System.out.println(str3.contentEquals("Kolhapur"));
        System.out.println(str3.intern());

        String str4 = new String("Kolhapur");
        System.out.println(str3.equals(str4));//it checks content of string
        System.out.println(str3==str4);//it checks refrence of string


    }
}
