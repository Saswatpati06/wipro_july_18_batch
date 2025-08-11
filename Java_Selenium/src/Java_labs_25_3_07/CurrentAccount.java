package Java_labs_25_3_07;

public class CurrentAccount implements Account {
    private double balance;
    private final double overdraftLimit = 5000;

    public CurrentAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Current Account.");
    }

    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Current Account.");
        }
    }

    public double calculateInterest() {
        return 0.0;
    }

    public void viewBalance() {
        System.out.println("Current Account Balance: ₹" + balance);
    }
}



