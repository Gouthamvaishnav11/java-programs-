// Interface  17/2/25
interface Animal {
    void makeSound(); // Abstract method
}

// Implementing the interface
class Cat implements Animal {
    
    public void makeSound() {
        System.out.println("Cat says: MeowMeow");
    }
}

public class Interface{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound(); // Calling interface method
    }
}


