package FileHanding;

import java.io.*;

public class BufferDemo2 {
    public static void main(String[] args) {

//        File file= new File("Text3.txt");
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;

        try {
            fileWriter = new FileWriter("C://Users//tejas salunkhe//IdeaProjects//CodeKulJAVA//src//FileHanding/sample.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Using BufferWriter");
            System.out.println("File write sucessfully");
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException a){
            System.out.println(a);
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader=null;

        try {
            fileReader = new FileReader("C://Users//tejas salunkhe//IdeaProjects//CodeKulJAVA//src//FileHanding/sample.txt");
            bufferedReader = new BufferedReader(fileReader);
            for (int i=bufferedReader.read();i>=0;){
                System.out.println((char)i);
                i=bufferedReader.read();
            }

            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
