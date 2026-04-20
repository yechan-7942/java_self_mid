package PS;
import java.util.Scanner;
import java.lang.Math;

public class PS_4 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("첫번째 좌표 입력");
      double x1 =  sc.nextDouble();
      double y1 =  sc.nextDouble();
      double x2 =  sc.nextDouble();
      double y2 =  sc.nextDouble();

       double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));

       System.out.println(dist);
    }
}
