package ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

// URLConnection 클래스 예제3
public class Ex16_5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "http://www.codechobo.com/main";

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("main");

            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // main
}
