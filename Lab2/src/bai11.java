import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char ch = myScanner.next().charAt(0); // Lấy ký tự đầu tiên người dùng nhập
        // Kiểm tra ký tự có phải chữ thường hay không
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Ký tự '" + ch + "' là chữ cái in thường.");
        } else {
            System.out.println("Ký tự '" + ch + "' không phải là chữ cái in thường.");
        }

    }
}
