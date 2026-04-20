package PS.PrePro_1.model;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    public static Student findTopSutdent(Student[] students){
        Student top = students[0];
        for(int i = 1; i < students.length; i++){
            if(top.getScore() < students[i].getScore()){
                top = students[i];
            }
        }
        return top;
    }
}
