import java.util.Scanner;

public class bai9 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = myScanner.nextInt();
        System.out.println("Nhập b:");
        int b = myScanner.nextInt();
        if (b == 0) {
            System.out.println("B phải lớn hơn 0");
        } else {
            System.out.println("a / b = " + a / b);
        }
    }
}
