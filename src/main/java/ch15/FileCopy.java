package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
// Ex15_5
FileInputStream과 FileOutputStream 예제2
 */
public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]); // src/main/java/ch15/FileCopy.java
            FileOutputStream fos = new FileOutputStream(args[1]); // src/main/java/ch15/FileCopy.bak

            int data =0;
            while ((data=fis.read())!=-1)
                fos.write(data); // void write(int b)

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
