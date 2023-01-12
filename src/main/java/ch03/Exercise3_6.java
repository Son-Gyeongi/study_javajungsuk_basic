package ch03;

public class Exercise3_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32))*100+0.5) / 100f;

        System.out.println((5/9f * (fahrenheit - 32)));
        System.out.println(celcius);
    }
}
