import java.util.Scanner;

class Vehicle {
    String vehicleNumber, brand;
    int speed;

    Vehicle(String vehicleNumber, String brand, int speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle: " + brand + " | Number: " + vehicleNumber + " | Speed: " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, int speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, int speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car details: number, brand, speed, doors");
        Car car = new Car(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());

        System.out.println("Enter Bike details: number, brand, speed, hasGear(true/false)");
        Bike bike = new Bike(sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());

        Vehicle v;

        v = car;
        v.displayDetails();

        v = bike;
        v.displayDetails();
    }
}
