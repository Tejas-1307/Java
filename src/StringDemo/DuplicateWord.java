package StringDemo;

public class DuplicateWord {

    public static void main(String[] args) {

        String str = "satara";
        char[] str2 = str.toCharArray();
//        String str1[] = str.split("");
        System.out.println("Duplicate word is:");

        for (int i=0 ;i < str.length(); i++){
            for (int j=i+1;j<str.length();j++){
                if (str2[i]==str2[j]){
                    System.out.print(str2[j]);
                }
//            if(str2[i] != str2[j]){
//                System.out.print(str2[i]);
//            }
            }

        }


    }
}
