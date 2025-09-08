import java.util.Scanner;

public class bai7 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên n có ít nhất 2 chữ số (lớn hơn 9 hoặc nhỏ hơn -9):");
        int n = myScanner.nextInt();
        int s = Math.abs((n / 10) % 10); // n / 10 để loại bỏ số cuối bởi chia nguyên của Java làm tròn về 0
        // % 10: để lấy phần cuối của số n / 10
        // Math.abs(): tránh trường hợp n < 0 hoặc để loại bỏ dấu âm
        System.out.println("Chữ số gần cuối của " + n + " là: " + s);
    }
}
