package self;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileOutputDemo3 {
    public static void main(String[] args) {
        String fileName = "out.txt";
        PrintWriter outputStream = null;
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("A for append or N for new file:");
            String ans = keyboard.nextLine();
            boolean append = (ans.equalsIgnoreCase("A"));
            outputStream = new PrintWriter(new FileOutputStream(fileName, append));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        // 이후에 파일에 쓰는 로직 추가
        System.out.println("Enter a line of text:");
        String line = keyboard.nextLine();
        outputStream.println(line);

        outputStream.close();
        System.out.println("Text written to " + fileName);
    }
}
