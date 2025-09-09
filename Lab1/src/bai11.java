import java.util.Scanner;

public class bai11 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        int a = myScanner.nextInt();
        System.out.println("Nhập số nguyên b: ");
        int b = myScanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Hoán đổi a và b nên kết quả của a: " + a + " ,b là: " + b);
    }
}
