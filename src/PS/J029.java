package PS;
import java.util.Scanner;

public class J029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] nums = new int[10];
        int count ;

        for(int i=0;i<10;i++) {
            System.out.println("Enter #" + (i + 1) + " number >");
            count = sc.nextInt();

            boolean D = false;

            for (int j = 0; j < 10; j++) {
                if (nums[j] == count) {
                    System.out.println("Duplicated ! Retry.");
                    D = true;
                    break;
                }
            }

            if (D != true) {
                nums[i] = count;
            } else {
                i--;
            }

        }

            for(int i=0; i<10; i++){
                System.out.printf("%d" ,nums[i]);
            }



    }
}
