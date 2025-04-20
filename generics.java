// Generic class definition
class Box<T> {
    private T value;  // Generic type variable

    // Constructor to initialize value
    public Box(T value) {
        this.value = value;
    }

    // Method to get the value
    public T getValue() {
        return value;
    }

    // Method to display the value
    public void display() {
        System.out.println("Stored value: " + value);
    }
}

// Main class
public class generics {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>(10);
        intBox.display();

        // Creating a Box for String
        Box<String> strBox = new Box<>("Hello, Generics!");
        strBox.display();

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>(15.5);
        doubleBox.display();
    }
}
