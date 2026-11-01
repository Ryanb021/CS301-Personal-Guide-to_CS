// Encapsulation

public class BankAccount {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(100);

        account.deposit(50);

        System.out.println(account.getBalance());
    }

    // Private Variable
    private double balance;
    
    // Constructor
    public BankAccount(double amount) {
        balance = amount;
    }

    // Add money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Get cuurrent balance
    public double getBalance() {
        return balance;
    }
}
