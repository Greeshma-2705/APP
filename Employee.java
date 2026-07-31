import java.util.Scanner;
public class Employee {
    String name;
    int age,id;
    void display(){
        System.out.println("NAME:"+name);
        System.out.println("ID:"+id);
        System.out.println("AGE:"+age);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Employee E1=new Employee();
        Employee E2=new Employee();
        System.out.println("ENTER NAME:");
        E1.name=scanner.nextLine();
        System.out.println("ENTER AGE:");
        E1.age=scanner.nextInt();
        System.out.println("ENTER ID:");
        E1.id=scanner.nextInt();
        E1.display();
        System.out.println("ENTER NAME:");
        E2.name=scanner.nextLine();
        scanner.nextLine();
        System.out.println("ENTER AGE:");
        E2.age=scanner.nextInt();
        System.out.println("ENTER ID:");
        E2.id=scanner.nextInt();
        E2.display();
        scanner.close();
    }
}
