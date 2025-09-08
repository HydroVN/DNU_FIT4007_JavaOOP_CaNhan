import java.util.Scanner;

public class bai2 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn r:");
        float r = myScanner.nextFloat();
        System.out.println("Chu vi hình tròn là:" + (2 * r * Math.PI));
        System.out.println("Diện tích hình tròn là: " + (r * r * Math.PI));
    }
}
