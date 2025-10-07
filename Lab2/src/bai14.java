import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = myScanner.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = myScanner.nextLine();
        if (a.length() > b.length()) {
            System.out.println("Chuỗi có độ dài lớn hơn là: " + a);
        }else if (b.length() > a.length()) {
            System.out.println("Chuỗi có độ dài lớn hơn là: " + b);
        }else {
            System.out.println("Hai chuỗi dài bằng nhau, in ra chuỗi a: " + a);
        }
    }
}
