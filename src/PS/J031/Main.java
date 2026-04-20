package PS.J031;
import java.util.*;
import PS.J031.model.Information;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userid = sc.nextLine();
        String password = sc.nextLine();
        String name = sc.nextLine();

        Information information = new Information(userid, password, name);

        if(!information.check()){
            System.out.println("Wrong Password");
        }
        else{
            information.print();
        }
    }
}
