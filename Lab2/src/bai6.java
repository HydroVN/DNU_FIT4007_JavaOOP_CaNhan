import java.util.Scanner;

public class bai6 {
     public static void main (String [] args) {
         Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = myScanner.nextInt();
        System.out.println("Nhập b:");
        int b = myScanner.nextInt();
        System.out.println("Nhập c:");
        int c = myScanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Ba số này CÓ THỂ là độ dài ba cạnh của một tam giác.");
            }else {
                System.out.println("Ba số này KHÔNG THỂ là tam giác (Không thỏa mãn bất đẳng thức tam giác).");
            }
        }else {
            System.out.println("Vui lòng nhập số nguyên dương");
        }
     }
}
