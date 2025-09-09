import java.util.Scanner;

public class bai12 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = myScanner.nextInt();
        System.out.println("Nhập b:");
        int b = myScanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Hoán đổi a và b nên kết quả của a: " + a + " ,b là: " + b);
    }
}
