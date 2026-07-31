import java.util.Scanner;
public class Student1 {
     String Name;
     int RollNo;
     String department;
     void display(){
        System.out.println("NAME:"+Name);
        System.out.println("ROLL NUMBER:"+RollNo);
        System.out.println("DEPARTMENT:"+department);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Student1 s1=new Student1();
            System.out.print("ENTER STUDENT NAME:");
            s1.Name=scanner.nextLine();
            System.out.println("ENTER STUDENT'S ROLL NUMBER:");
            s1.RollNo=scanner.nextInt();
            scanner.nextLine();
            System.out.println("ENTER DEPARTMENT:");
            s1.department=scanner.nextLine();
            s1.display();
            scanner.close();
        }
}}
