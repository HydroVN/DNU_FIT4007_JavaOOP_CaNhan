import java.util.Scanner;

public class bai10 {
    public static void main (String [] agrs) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập 1 ký tự thường (từ a đến y):");
        char word = myScanner.next().charAt(0);
        if(word == 'z') {
            System.out.println("Không có ký tự nào sau " + word);
        }else {
            char newWord = (char) (word + 1);
            System.out.println("Chữ cái liền sau của " + word + " là: " + newWord);
        }
    }
}
