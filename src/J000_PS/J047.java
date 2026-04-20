package J000_PS;

import java.util.*;

public class J047 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        System.out.println("문자를 입력하시오");
        String s = cin.nextLine();

        System.out.println(s.replaceAll(" ", ""));
    }
}
