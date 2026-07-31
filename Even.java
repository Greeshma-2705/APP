import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int n1=scanner.nextInt();
        if(n1%2==0){
        System.out.print("the number "+n1+" is a even number");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
