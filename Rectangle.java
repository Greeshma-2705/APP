import java.util.Scanner;
public class Rectangle {
    double l,b,a;
    void calculatearea() {
        a=l*b;
        System.out.println("AREA OF RECTANGLE:"+a);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Rectangle R=new Rectangle();
        System.out.println("enter the length:");
        R.l=scanner.nextDouble();
        System.out.println("enter the breadth:");
        R.b=scanner.nextDouble();
        R.calculatearea();
        scanner.close();
    }
}
