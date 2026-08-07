import java.util.Scanner;
public class attendance {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in); 
     int presentcount=0,i;
     float totalatt,percentage;
     int[] attendance=new int[7];
     for(i=0;i<7;i++){
        System.out.println("ENTER ATTENDANCE OF DAY "+(i+1)+":");
        attendance[i]=scanner.nextInt();
        if(attendance[i]==1)
        presentcount++;
     }
    totalatt=(float)presentcount/7;
     percentage=totalatt*100;
     if(percentage>=75){
        System.out.println("Eligible for exam");
     }
     else{
        System.out.println("Not eligible for exam");
     }
     scanner.close();
}
}