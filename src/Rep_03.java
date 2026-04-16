import java.util.Locale;
import java.util.Scanner;

public class Rep_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("enter a line of text.");
            String n = sc.nextLine();

            if(n.equalsIgnoreCase("quit")){
                break;
            }
            int index = n.toLowerCase().indexOf("hate");
            if(index != -1){
                String r = n.substring(0, index) + "love" + n.substring(index+4);
                System.out.println("I have rephrased that line to reat");
                System.out.println(r);
            }
            
            else{
                System.out.println("I have rephrased that line to reat");
                System.out.println(n);
            }









        }
    }
}
