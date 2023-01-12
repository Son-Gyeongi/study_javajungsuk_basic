package ch02;

public class PrintfEx1 {
    public static void main(String[] args) {
//        System.out.println(10.0/3);

//        System.out.printf("%d%n", 15);
//        System.out.printf("%#o%n", 15);
//        System.out.printf("%#x%n", 15);
//        System.out.printf("%s", Integer.toBinaryString(15));

//        double f = 123.456789;
//        System.out.printf("%f%n", f);
//        System.out.printf("%e%n", f);
//        System.out.printf("%g%n", f);

        System.out.printf("[%5d]%n", 1234567);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);

        double d = 1.23456789;
        System.out.printf("%.6f%n", d);

        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com");
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com");
    }
}
