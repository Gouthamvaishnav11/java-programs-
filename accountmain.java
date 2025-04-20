class BankAccount {
    // Private variables
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor 
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    // printing information method
    public void getAccInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

    class accountmain{
        public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account = new BankAccount("1234456678", "Goutham", 0.0);

        // calling methods
        // account.deposit(1000);
        // account.withdraw(500);
        // account.deposit(200);
        // account.withdraw(300);
        account.getAccInfo();

    }
}

