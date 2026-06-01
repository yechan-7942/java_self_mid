import java.io.*;
import java.util.Scanner;

public class BinaryOutputDemo {
    public static void main(String[] args) {
        String fileName = "numbers.dat";
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(fileName));

            Scanner keyboard = new Scanner(System.in);
            int n;
            do {
                n = keyboard.nextInt();
                out.writeInt(n);
            } while (n >= 0);   // 음수 입력하면 그것도 쓰고 종료

            out.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("파일 열기 실패");
        }
        catch (IOException e) {
            System.out.println("쓰기 실패");
        }
    }
}