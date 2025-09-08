import java.util.Scanner;

public class bai4 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ 1 của tam giác:");
        double a = myScanner.nextDouble();
        System.out.println("Nhập cạnh thứ 2 của tam giác:");
        double b = myScanner.nextDouble();
        System.out.println("Nhập cạnh thứ 3 trong tam giác:");
        double c = myScanner.nextDouble();
        System.out.println("Chu vi của tam giác:" + (a + b + c));
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        System.out.println("Diện tích của tam giác:" + (Math.sqrt(s)));
    }
}
