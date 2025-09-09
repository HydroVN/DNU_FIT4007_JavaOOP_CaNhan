import java.util.Scanner;

public class bai4 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = myScanner.nextInt();
        System.out.println("Nhập b:");
        int b = myScanner.nextInt();
        if (a > b) {
            System.out.println("A lớn hơn b");
        } else if (a == b) {
            System.out.println("A và b bằng nhau");
        } else {
            System.out.println("B lớn hơn a");
        }
    }
}
