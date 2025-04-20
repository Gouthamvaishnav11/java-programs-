import java.util.Scanner;

// Abstract class for Login page
abstract class LoginSystem {
    
    abstract boolean authenticate(String username, String password);

}

//  the data is hidded
class UserLogin extends LoginSystem {
    private  String validUsername = "admin";
    private  String validPassword = "password123";

    // Implementing the abstract method for the authenticating the data for username and passsword
    

    boolean authenticate(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }
}

// Main class
public class abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();

         // Taking user input
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Authenticating user checking the username and password
        if (userLogin.authenticate(username, password)) {
            System.out.println("Login Successful! Access Granted.");
        } else {
            System.out.println("Login Failed! Invalid credentials.");
        }

        scanner.close();
    }
}

