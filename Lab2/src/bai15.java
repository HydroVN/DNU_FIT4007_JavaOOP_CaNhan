import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Nhập giờ (0-23): ");
        int h = myScanner.nextInt();
        System.out.print("Nhập phút (0-59): ");
        int m = myScanner.nextInt();
        if (h >= 0 && h < 24 && m >= 0 && m < 60) {
            m++; // tăng thêm 1 phút
            if (m == 60) { // nếu phút = 60 thì tăng giờ
                m = 0;
                h++;
                if (h == 24) { // nếu giờ = 24 thì quay lại 0
                    h = 0;
                }
            }
            System.out.printf("Thời gian sau 1 phút nữa là: %02d:%02d\n", h, m);
        }else {
            System.out.println("Giờ hoặc phút không hợp lệ!");
        }
    }
}
