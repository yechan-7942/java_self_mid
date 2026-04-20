package PS;
import  java.util.Scanner;


public class J021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("사람 수를 입력하시오");
        int n;
        n= s.nextInt();

        int [] height = new int[n];
        int [] weight = new int[n];
        double [] bmi = new double[n];
        int people=0;


        for(int i=0; i<n; i++){
            height[i]= s.nextInt();
            weight[i]= s.nextInt();

            bmi[i] = weight[i]/(height[i]*height[i]*0.01 * 0.01);
            if(bmi[i] >=25){
                people ++;
            }
        }
        System.out.println("비만 사람의 수 : " +people);
    }
}
