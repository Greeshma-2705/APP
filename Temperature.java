import java.util.Scanner;
public class Temperature {
    double C;
    void calc(){
        double F=((C*9)/5)+32;
        System.out.println("TEMPERATURE IN F:"+F);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Temperature t=new Temperature();
        System.out.println("enter temperature in celcius:");
        t.C=scanner.nextDouble();
        t.calc();
        scanner.close();
    }
}
