import java.util.Scanner;

public class bai5 {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        int year = 2023;
        System.out.println("Nhập tuổi của bạn để ra năm sinh (tính đến năm 2023):");
        int yearOld = myScanner.nextInt();
        System.out.println("Năm sinh của bạn là:" + (year - yearOld));
    }
}
