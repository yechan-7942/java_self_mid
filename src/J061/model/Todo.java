package J061.model;

public class Todo {
    private String title;
    private String content;
    private String deadline;
    private String category;

    public Todo(String title,String content, String deadline, String category){
        this.title = title;
        this.content = content;
        this.deadline = deadline;
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + title + ", " + content + ", " + deadline + ", " + category + "]";
    }


}
