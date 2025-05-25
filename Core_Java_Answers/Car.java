// Exercise 17: Class and Object Creation (Car Class)
// This class represents a Car object with make, model, and year properties.

public class Car {
    String make;
    String model;
    int year;
    
    // Constructor to initialize the car's information.
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Display car details on the console.
    public void displayDetails() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }
    
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Accord", 2021);
        car1.displayDetails();
        car2.displayDetails();
    }
}