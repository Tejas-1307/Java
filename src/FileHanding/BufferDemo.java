package FileHanding;

import java.io.*;
import java.util.Scanner;

public class BufferDemo {
    public static void main(String[] args) {
        File file = new File("Text2.txt");
        Scanner sc = new Scanner(System.in);

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            System.out.println("Enter the value");
            String str = sc.next();
            byte [] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("file write successfully");
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            FileInputStream fileInputStream = new FileInputStream(file);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            for (int i =fileInputStream.read();i>=0;){
                System.out.println((char)i);
                i=bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
