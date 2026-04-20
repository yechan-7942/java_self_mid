package J000_PS;
import java.util.Scanner;
public class J024 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int first = numbers[0];
        int second = Integer.MIN_VALUE;
        int second_max_index = 0;

        Scanner s = new Scanner(System.in);

        // 10개의 값 입력받기
        for (int i = 0; i < 10; i++) {
            numbers[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > first) {
                second = first;
                second_max_index = i;
                first = numbers[i];
            } else if (numbers[i] > second && numbers[i] < first) {
                second = numbers[i];
                second_max_index = i;
            }
        }
        System.out.println("[" + second_max_index + "]" + second);
    }
    }
