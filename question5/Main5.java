import course.Course;
import java.util.Scanner;
import student.Student;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name and id:");
        String name = sc.next();
        int id = sc.nextInt();
        Student s = new Student(name, id);

        System.out.println("Enter course title and code:");
        String title = sc.next();
        int code = sc.nextInt();
        Course c = new Course(title, code);

        s.display();
        c.display();
    }
}
