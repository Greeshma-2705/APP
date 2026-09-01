import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Net Banking.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        double amt = sc.nextDouble();

        System.out.println("Choose method: 1.CreditCard 2.UPI 3.NetBanking");
        int choice = sc.nextInt();

        Payment p;
        switch (choice) {
            case 1: p = new CreditCardPayment(); break;
            case 2: p = new UPIPayment(); break;
            case 3: p = new NetBankingPayment(); break;
            default: System.out.println("Invalid"); return;
        }
        p.pay(amt);
    }
}
