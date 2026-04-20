package PS.PrePro_2.model;

public class Account {
    private int balance = 50000;


    public Account(int balance) {
        if(balance <0){
            System.out.println("초기 잔액은 음수 일 수 없음");
            this.balance = 0;
        }
        else{
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount < 0){
            System.out.println("입금액은 양수여야 합니다 . 입력학: " + amount);
            return;
        }
        balance += amount;
        System.out.println();
        System.out.println("임급 완료 : "  + amount +"원 | 현재 잔액 :" +balance );
    }

    public void withdraw(int amount){
        if(amount < 0){
            System.out.println("출금액은 양수여야 합니다. 입력값 : " + amount);
            return;
        }
        if(amount > balance){
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
        System.out.println();
        System.out.println("출금 완료 :" + amount + "원 | 현재 잔액 : " + balance+ "원");
    }



}
