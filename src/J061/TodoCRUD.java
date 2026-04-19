package J061;
import J061.model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TodoCRUD {

    private ArrayList<Todo> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addTodo(){
        System.out.println("제목");
        String name = sc.nextLine();
        System.out.println("내용");
        String contents = sc.nextLine();
        System.out.println("마감일");
        String date = sc.nextLine();
        System.out.println("카테고리");
        String category = sc.nextLine();

        list.add(new Todo(name,contents,date,category));
        System.out.println("추가 완료");
    }

    public void editTodo(){
        System.out.println("수정할 제목");
        String name = sc.nextLine();

        for(Todo t :  list){
            if(t.getTitle().equals(name) ){
                System.out.println("새로운 내용");
                t.setContent(sc.nextLine());
                System.out.println("새 마감일");
                t.setContent(sc.nextLine());
                System.out.println("새 카테고리");
                t.setContent(sc.nextLine());
                return;
            }
        }
        System.out.println("일정을 찾을 수 없습니다");
    }

    public void showTodo(){
        for(int i = 0; i < list.size(); i++){
            System.out.println( i+1 + ". " + list.get(i));
        }

    }

    public void deleteTodo(){
        System.out.println("삭제할 목록");
        String name = sc.nextLine();

        for(Todo t :  list){
            if(t.getTitle().equals(name)){
                list.remove(t);
                System.out.println("삭제완료");
                return;
            }
        }
    }






















}
