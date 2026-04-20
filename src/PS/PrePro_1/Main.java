package PS.PrePro_1;
import PS.PrePro_1.model.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[3];

        for(int i = 0; i < student.length; i++){
            System.out.println("Student " + (i + 1) +" 이름 " + ":");
            String name = sc.nextLine();

            System.out.println("Student " + (i + 1) +"성적 " +  ":");
            int score = sc.nextInt();
            sc.nextLine();

            student[i] = new Student(name, score);
        }
        Student topStudent = Student.findTopSutdent(student);
        System.out.println(topStudent.getName());
    }
}
