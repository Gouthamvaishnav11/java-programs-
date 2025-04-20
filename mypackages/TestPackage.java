// Define a package
package mypackages;

// First class inside the package
class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass inside mypackage!");
    }
}

// Second class inside the package
class AnotherClass {
    public void show() {
        System.out.println("Hello from AnotherClass inside mypackage!");
    }
}

// Main class inside the same package
public class TestPackage {
    public static void main(String[] args) {
        // Create objects of both classes
        MyClass obj1 = new MyClass();
        obj1.displayMessage();

        AnotherClass obj2 = new AnotherClass();
        obj2.show();
    }
}

