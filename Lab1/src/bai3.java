import java.util.Scanner;

public class bai3 {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài HCN:");
        int length = myScanner.nextInt();
        System.out.println("Nhập chiều rộng HCN:");
        int width = myScanner.nextInt();
        System.out.println("Chu vi HCN:" + (2 * (length + width)));
        System.out.println("Diện tích HCN:" +(length * width));
    }
}
