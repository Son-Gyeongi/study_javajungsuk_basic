package ch15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// FileReader와 FileWriter 예제2
public class Ex15_9 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);

            int data = 0;
            while ((data = fr.read()) != -1) {
                if (data != '\t' && data != '\n' && data != ' ' && data != '\r')
                    fw.write(data);
                }

            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // main
}
