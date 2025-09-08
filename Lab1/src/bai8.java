import java.util.Scanner;

public class bai8 {
    public static void main (String [] agrs) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = myScanner.nextLine();
        System.out.println("Độ dài tên của bạn là: " + name.length());
    }
}
