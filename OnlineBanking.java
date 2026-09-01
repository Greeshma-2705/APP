import java.util.Scanner;
interface Payment {
    void pay(double amount);
}

interface SecurePayment extends Payment {
    void verifyPayment();
}

interface OnlineTransaction {}

class Account {
    String accNo;
    Account(String accNo) { this.accNo = accNo; }
    void displayDetails() { System.out.println("Account: " + accNo); }
}

class SavingsAccount extends Account {
    SavingsAccount(String accNo) { super(accNo); }
    @Override void displayDetails() { System.out.println("Savings Account: " + accNo); }
}

class CurrentAccount extends Account {
    CurrentAccount(String accNo) { super(accNo); }
    @Override void displayDetails() { System.out.println("Current Account: " + accNo); }
}

class UPIPayment implements SecurePayment, OnlineTransaction {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI."); }
    public void verifyPayment() { System.out.println("UPI Payment verified."); }
}

class CardPayment implements Payment, OnlineTransaction {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Card."); }
}

public class OnlineBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account type (1.Savings 2.Current) and number:");
        int type = sc.nextInt();
        String accNo = sc.next();
        Account acc = (type == 1) ? new SavingsAccount(accNo) : new CurrentAccount(accNo);
        acc.displayDetails();

        System.out.println("Enter amount:");
        double amt = sc.nextDouble();

        System.out.println("Choose payment (1.UPI 2.Card):");
        int choice = sc.nextInt();

        Payment p;
        if (choice == 1) {
            UPIPayment upi = new UPIPayment();
            upi.verifyPayment();
            p = upi;
        } else {
            p = new CardPayment();
        }
        p.pay(amt);
    }
}
