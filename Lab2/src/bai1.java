import java.util.Scanner;

public class bai1 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = myScanner.nextInt();
        if (n < 0) {
            System.out.println("Số " + n + " không phải là số tự nhiên");
        }else {
            System.out.println("Số " + n + " là số tự nhiên");
        }
    }
}
