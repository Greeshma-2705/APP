import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("ENTER 2 NUMBERS: ");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int sum=n1+n2;
        System.out.println("the sum is "+sum);
    }
}

