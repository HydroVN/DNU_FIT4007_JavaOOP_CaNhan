import java.util.Scanner;

public class bai8 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập 1 số thực:");
        float a = myScanner.nextFloat();
        if(a == (int)a) {
            System.out.println("Là số nguyên");
        } else{
            System.out.println("Không phải là số nguyên");
        }
    }
}
