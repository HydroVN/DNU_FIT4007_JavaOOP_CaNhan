import java.util.Scanner;
// giống bài 11 nhưng ngược lại
public class bai12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char ch = myScanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Ký tự '" + ch + "' là chữ cái in hoa.");
        } else {
            System.out.println("Ký tự '" + ch + "' không phải là chữ cái in hoa.");
        }
    }
}
