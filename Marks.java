import java.util.Scanner;
public class Marks {
    double m1,m2,m3;
    void calcmarks(){
        double total=m1+m2+m3;
        double average=(total)/3;
        System.out.println("TOTAL MARKS :"+total);
        System.out.println("AVERAGE OF THE MARKS:"+average);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Marks M=new Marks();
        System.out.println("enter marks of 1st subject:");
        M.m1=scanner.nextDouble();
        System.out.println("enter marks of 2nd subject:");
        M.m2=scanner.nextDouble();
        System.out.println("enter marks of 3rd subject:");
        M.m3=scanner.nextDouble();
        M.calcmarks();
        scanner.close();
    }
}
