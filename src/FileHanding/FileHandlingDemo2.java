package FileHanding;

import java.io.*;

public class FileHandlingDemo2 {

    public static void main(String[] args) {

        File file = new File("text1.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);
            String str ="welocme Writer";
            fileWriter.write(str);
            System.out.println("file added");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader(file);

            for(int i=fileReader.read();i>=0;){
                System.out.print((char)i);
                i=fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//try will resources
//file method