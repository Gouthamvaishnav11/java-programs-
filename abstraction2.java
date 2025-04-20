import java.util.Scanner;

// Abstract class for Vehicle
abstract class Vehicle {
    String vehicleType;

    // Constructor
    Vehicle(String type) {
        this.vehicleType = type;
    }

    // Abstract methods
    abstract void detectVehicle();
    
}

public class abstraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehicle Detection System:");
        System.out.println("1. Car\n2. Bike\n3. Truck");
        System.out.print("Enter the number corresponding to the detected vehicle: ");
        int choice = scanner.nextInt();

        // Using direct object creation without heaps, arrays, or collections
        if (choice == 1) {
            Vehicle car = new Vehicle("Car") {
                
                void detectVehicle() {
                    System.out.println("A Car has been detected.");
                }

            
            };
            car.detectVehicle();
            
        } else if (choice == 2) {
            Vehicle bike = new Vehicle("Bike") {
                void detectVehicle() {
                    System.out.println("A Bike has been detected.");
                }
                
            };
            bike.detectVehicle();
            
        } else if (choice == 3) {
            Vehicle truck = new Vehicle("Truck") {
                
                void detectVehicle() {
                    System.out.println("A Truck has been detected.");
                }
            };
            truck.detectVehicle();
            
        } else {
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}


