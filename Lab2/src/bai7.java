import java.util.Scanner;

public class bai7 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập góc a:");
        int a = myScanner.nextInt();
        System.out.println("Nhập góc b:");
        int b = myScanner.nextInt();
        System.out.println("Nhập góc c:");
        int c = myScanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b + c == 180) {
                System.out.println("Là tam giác vuông");
            }else {
                System.out.println("Không phải là tam giác vuông");
            }
        }else {
            System.out.println("Vui lòng nhập số nguyên dương");
        }
    }
}
