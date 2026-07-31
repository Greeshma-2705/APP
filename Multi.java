import java.util.Scanner;
public class Multi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n=scanner.nextInt();
        for (int i = 1; i <11; i++) {
            int s=n*i;
            System.out.println(n+"*"+i+"="+s);
        }
    }
}
