package PS;
import java.util.Scanner;

public class J027 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] height = new int[10];
        int[] width = new int[10];
        double[]bmi = new double[10];

        int [] bma_per =  new int[10];
        int count =0;
        int i;

        System.out.println("사람 수를 입력하시오");
        int n = s.nextInt();
        for(i=0;i<n;i++) {
            height[i] = s.nextInt();
            width[i] = s.nextInt();
            bmi[i] = height[i] * (width[i] * width[i] * 0.01 * 0.01);
            if (bmi[i] >= 25) {
                count++;
            }
        }
        System.out.println("Overweight person - " );
        System.out.println("Total - " + count);

    }
}
