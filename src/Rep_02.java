import java.util.Scanner;

public class Rep_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter a line of text.") ;
        String n = sc.nextLine();
        int index = n.indexOf("hate");
        System.out.println("First occurrence of \"hate\" is at index " + index);



    }
}
