package PS.PrePro_4;
import PS.PrePro_4.model.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== 2차원 좌표 거리 계산 ===");
        System.out.println("1. 원점 (0, 0) 사용");
        System.out.println("2. 좌표 직접 입력");
        System.out.print("선택: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            Point p = new Point(); // 매개변수 없는 생성자
            System.out.println("좌표: (" + p.getX() + ", " + p.getY() + ")");
            System.out.println("원점으로부터 거리: " + p.distance());

        } else if (choice == 2) {
            System.out.print("x 좌표 입력: ");
            double x = sc.nextDouble();
            System.out.print("y 좌표 입력: ");
            double y = sc.nextDouble();

            Point p = new Point(x, y); // x, y 받는 생성자
            System.out.println("좌표: (" + p.getX() + ", " + p.getY() + ")");
            System.out.printf("원점으로부터 거리: %.2f%n", p.distance()); // 소수점 2자리

        } else {
            System.out.println("[오류] 1 또는 2를 선택하세요.");
        }

    }
}
