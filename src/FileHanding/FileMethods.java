package FileHanding;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        try {
            File file = new File("sample1.txt");
            if(file.exists()){
                System.out.println("file is already exsist");
            }
            else {
                file.createNewFile();
            }
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalFile());
            System.out.println(file.canExecute());
            System.out.println(file.getPath());

            System.out.println(file.setReadOnly());
            System.out.println(file.getFreeSpace());
            System.out.println(file.getTotalSpace());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            System.out.println(file.length());

            File file1 = new File("Text");
            file1.mkdir();

            File file2 = new File("Text/textfile.txt");
            file2.createNewFile();

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
