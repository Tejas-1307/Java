package FileHanding;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try( FileWriter fileWriter =new FileWriter("C://Users//tejas salunkhe//IdeaProjects//CodeKulJAVA//src//FileHanding/sample.txt");) {
            fileWriter.write("India is my country");
            System.out.println("file write successfully");
        } catch (IOException a) {
            System.out.println(a);
        }

        try(FileReader fileReader =new FileReader("C://Users//tejas salunkhe//IdeaProjects//CodeKulJAVA//src//FileHanding/sample.txt");) {
            for (int i = fileReader.read(); i >= 0; ) {
                System.out.println((char) i);
                i = fileReader.read();
            }
            System.out.println();
            System.out.println("FileRead successfully");
        } catch (IOException s) {
            throw new RuntimeException();
        }
        }
    }


