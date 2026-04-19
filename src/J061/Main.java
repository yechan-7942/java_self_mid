package J061;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main ps = new Main();//
        ps.run();
    }

    public void run(){
        int menu, quit =0;
        Scanner sc = new Scanner(System.in);
        TodoCRUD manage = new TodoCRUD();

        while(true){
            System.out.println("메뉴");
            menu = sc.nextInt();

            switch(menu){
                case 1: manage.addTodo(); break;
                case 2: manage.deleteTodo(); break;
                case 3: manage.editTodo(); break;
                case 4: manage.showTodo(); break;
                default: quit = 1;


            }
            if(quit == 1){
                break;
            }
        }

    }
}
