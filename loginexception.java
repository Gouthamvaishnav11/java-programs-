import java.util.Scanner;

// Custom Exception Class for Account Locking
class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

// Abstract class for Login page
abstract class LoginSystem {
    abstract boolean authenticate(String username, String password)throws AccountLockedException  ;
}


class UserLogin extends LoginSystem {
    private final String validUsername = "admin";
    private final String validPassword = "password123";

    private int attempts = 0;
    private static final int MAX_ATTEMPTS = 3; // Maximum attempts allowed

    boolean authenticate(String username, String password) throws AccountLockedException {
        if (attempts >= MAX_ATTEMPTS) {
            throw new AccountLockedException("Account is locked due to multiple failed attempts!");
        }

        if (username.equals(validUsername) && password.equals(validPassword)) {
            attempts = 0; // Reset attempts on successful login
            return true;
        } else {
            attempts++;
            if (attempts >= MAX_ATTEMPTS) {
                throw new AccountLockedException("Account is locked due to multiple failed attempts!");
            }
            return false;
        }
    }
}

// Main class
public class loginexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();

        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            try {
                // Taking user input
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                // Authenticating user
                if (userLogin.authenticate(username, password)) {
                    System.out.println("Login Successful! Access Granted.");
                    break;
                } else {
                    attempts++;
                    System.out.println("Login Failed! Attempts left: " + (MAX_ATTEMPTS - attempts));
                }
            } catch (AccountLockedException e) {
                System.out.println("Exception: " + e.getMessage());
                break;
            }
        }

        scanner.close();
    }
}
