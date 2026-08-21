abstract class Prod {
    int id;
    String name;
    double price;

    Prod(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}

class Electronics extends Prod {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Prod {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Prod {
    Books(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class Product {
    public static void main(String[] args) {

        Prod p1 = new Electronics(101, "Laptop", 50000);
        Prod p2 = new Clothing(102, "Shirt", 2000);
        Prod p3 = new Books(103, "Java Book", 1000);

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}