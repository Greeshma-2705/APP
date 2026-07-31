import java.util.Scanner;
public class Book{
    String Title;
    String author;
    double price;
    void displaydet(){
        System.out.println("TITLE OF THE BOOK:"+Title);
        System.out.println("AUTHOR:"+author);
        System.out.println("PRICE:"+price);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Book B=new Book();
        System.out.println("enter the title of the book:");
        B.Title=scanner.nextLine();
        System.out.println("enter the name of the author:");
        B.author=scanner.nextLine();
        System.out.println("enter the price:");
        B.price=scanner.nextDouble();
        B.displaydet();
        scanner.close();
    }
}
