package course;

public class Course {
    private String title;
    private int code;

    public Course(String title, int code) {
        this.title = title;
        this.code = code;
    }

    public void display() {
        System.out.println("Course: " + title + " | Code: " + code);
    }
}
