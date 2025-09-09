import java.util.Scanner;

public class bai10 {
    public static void main (String [] agrs) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nhập 1 ký tự thường (từ a đến y):");
        char word = myScanner.next().charAt(0); // .next(): đọc ký tự người dùng nhập
        // .chartAt(0): trả về ký tự ở "At" số 0, là ký tự đầu tiên trong chuỗi
        // Ví dụ: Người dùng nhập "abc" thì qua .charAt(0) thì nó sẽ lấy ký tự đầu là "a"
        if(word == 'z') {
            System.out.println("Không có ký tự nào sau " + word);
        }else {
            char newWord = (char) (word + 1); // (char): ép kiểu từ int sang char
            System.out.println("Chữ cái liền sau của " + word + " là: " + newWord);
        }
    }
}
