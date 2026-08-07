import java.util.Scanner;
public class bill {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int total=0; 
int[] price =new int[5];
for(int i=0;i<5;i++){
System.out.println("enter:");
price[i]=scanner.nextInt();
total+=price[i];
}
System.out.println("Total bill:"+total);
}
}
