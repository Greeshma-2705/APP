public class Car {
    String modelname;
    int price;
    Car(){
        this.modelname="ford";
        this.price=1450000;
    }

    Car(String modelname) {
        this.modelname = modelname;
        this.price = 150000;
    }

    Car(String modelname, int price) {
        this.modelname = modelname;
        this.price = price;
    }
    void display(){
        System.out.println("MODEL NAME: "+modelname);
        System.out.println("PRICE: "+price);
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
        Car c1=new Car("Innova");
        c1.display();
        Car c2=new Car("sedan ", 1904050);
        c2.display();
    }
}
