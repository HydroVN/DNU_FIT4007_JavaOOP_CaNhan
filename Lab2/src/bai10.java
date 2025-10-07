import java.util.Scanner;

public class bai10 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = myScanner.nextInt();
        System.out.println("Nhập b:");
        int b = myScanner.nextInt();
        System.out.println("Nhập c:");
        int c = myScanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a % b == 0 && b % c == 0) {
                System.out.println("B vừa là ước của a vừa là bội của c");
            }else {
                System.out.println("Không thỏa mãn");
            }
        }else {
            System.out.println("Vui lòng nhập số nguyên dương");
        }
    }
}
