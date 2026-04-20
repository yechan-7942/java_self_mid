package PS.PrePro_2;
import PS.PrePro_2.model.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account(50000);

        while (true) {
            System.out.println("\n=== 계좌 관리 시스템 ===");
            System.out.println("현재 잔액: " + account.getBalance() + "원");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("입금액 입력: ");
                int amount = sc.nextInt();
                account.deposit(amount);

            } else if (choice == 2) {
                System.out.print("출금액 입력: ");
                int amount = sc.nextInt();
                account.withdraw(amount);

            } else if (choice == 3) {
                System.out.println("종료합니다.");
                break;

            } else {
                System.out.println("[오류] 1, 2, 3 중에서 선택하세요.");
            }
        }
    }
}
