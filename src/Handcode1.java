import java.util.*;
public class Handcode1 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("숫자를 입력사이오");
        int number =s.nextInt();
        boolean isPositvie =(number>0);

        if(isPositvie){
            System.out.println("posivive");
        }
        else{
            System.out.println("negative zereo");
        }

        
    }
    
}
