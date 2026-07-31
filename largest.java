import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER 3 NUMBERS:");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("The largest number is "+n1);
        }
        else if(n2>n1&&n2>n3){
            System.out.println("The largest number is "+n2);
        }
        else{
            System.out.println("The largest number is "+n3);
        }
    }
}
