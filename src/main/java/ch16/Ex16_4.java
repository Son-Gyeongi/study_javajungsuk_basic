package ch16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

// URLConnection 클래스 예제2
public class Ex16_4 {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "http://www.codechobo.com/main";
        String line = "";

        try {
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // main
}
