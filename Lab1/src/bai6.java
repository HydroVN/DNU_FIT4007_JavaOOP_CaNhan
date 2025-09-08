import java.util.Scanner;

public class bai6 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên n:");
        int n = myScanner.nextInt();
        int s = Math.abs(n % 10);
        System.out.println("Số dư của " + n + " khi chia hết cho 10 là: " + s);
    }
}
