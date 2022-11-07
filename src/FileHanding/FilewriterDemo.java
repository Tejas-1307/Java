package FileHanding;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C://Users//tejas salunkhe//IdeaProjects//CodeKulJAVA//src//FileHanding/sample.txt");
            fileWriter.write("India is my country");
            System.out.println("file write successfully");
        } catch (IOException a) {
            System.out.println(a);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C://Users//tejas salunkhe//IdeaProjects//CodeKulJAVA//src//FileHanding/sample.txt");
            for (int i = fileReader.read(); i >= 0; ) {
                System.out.println((char) i);
                i = fileReader.read();
            }
            System.out.println();
            System.out.println("FileRead successfully");
        } catch (IOException s) {
            throw new RuntimeException();
        } finally {
            try {
                fileReader.close();
            } catch (IOException s) {
                throw new RuntimeException();
            }
        }
    }
}
