import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = myScanner.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = myScanner.nextLine();
        //Sử dụng hàm equals để kiểm tra 2 chuỗi có bằng nhau hay không
        //Không dùng == bởi khác bộ nhở (chỉ dùng khi kiểu dữ liệu nguyên thủy "int, double, float...")
        if (a.equals(b)) {
            System.out.println("Hai chuỗi giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }
    }
}
