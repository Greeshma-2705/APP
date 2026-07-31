import java.util.Scanner;
public class Student2 {
    String Name;
     int RollNo;
     String department;
     void display(){
        System.out.println("NAME:"+Name);
        System.out.println("ROLL NUMBER:"+RollNo);
        System.out.println("DEPARTMENT:"+department);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        System.out.print("ENTER STUDENT NAME:");
        s1.Name=scanner.nextLine();
        System.out.println("ENTER STUDENT'S ROLL NUMBER:");
        s1.RollNo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("ENTER DEPARTMENT:");
        s1.department=scanner.nextLine();
        s1.display();
        System.out.print("ENTER STUDENT NAME:");
        s2.Name=scanner.nextLine();
        System.out.println("ENTER STUDENT'S ROLL NUMBER:");
        s2.RollNo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("ENTER DEPARTMENT:");
        s2.department=scanner.nextLine();
        s2.display();
        scanner.close();
    }
}
