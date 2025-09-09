import java.util.Scanner;

public class bai5 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập điểm số hợp lí từ 0 đến 10:");
        int score = myScanner.nextInt();
        if (score >=0 && score <= 10 ) {
            System.out.println("Điểm số hợp lí");
        } else {
            System.out.println("Điểm số chx hợp lí");
        }
    }
}
