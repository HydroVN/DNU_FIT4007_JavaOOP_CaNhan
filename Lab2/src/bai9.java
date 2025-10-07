import java.util.Scanner;

public class bai9 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = myScanner.nextInt();
        int canBacHai = (int) Math.sqrt(n);
        if (n > 0) {
            if (canBacHai * canBacHai == n) {
                System.out.println("Là số chính phương");
            }else {
                System.out.println("Không phải là số chính phương");
            }
        }else {
            System.out.println("Vui lòng nhập số nguyên dương");
        }
    }
}
