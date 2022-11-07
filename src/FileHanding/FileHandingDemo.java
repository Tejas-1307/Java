package FileHanding;

import java.io.*;

public class FileHandingDemo {
    public static void main(String[] args) {

        File file = new File("text.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str ="welcome";
            byte[] arr =str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write sucessfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);

//            int i= fileInputStream.read();
            for (int i=fileInputStream.read();i>=0;){
                System.out.print((char)i);
                i= fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
