import java.util.Scanner;

public class bai3 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = myScanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("N là số chẵn");
        }else {
            System.out.println("N là số lẻ");
        }
    }
}
