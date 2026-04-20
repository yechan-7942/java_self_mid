package PS.J034;
import PS.J034.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String password = sc.nextLine();

        User user = new User();
        System.out.println(user.login(name,password));

    }
}
