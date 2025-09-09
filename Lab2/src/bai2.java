import java.util.Scanner;

public class bai2 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = myScanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int width = myScanner.nextInt();
        if (length == width) {
            System.out.println("Đây là hình vuông");
        }else {
            System.out.println("Đây là hình chữ nhật");
        }
    }
}
