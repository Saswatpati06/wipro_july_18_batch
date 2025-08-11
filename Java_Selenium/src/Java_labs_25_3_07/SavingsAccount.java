package Java_labs_25_3_07;

public class SavingsAccount implements Account {
    private double balance;
    private final double interestRate = 0.04;

    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Savings Account.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Savings Account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void viewBalance1() {
        System.out.println("Savings Account Balance: ₹" + balance);
    }



	    public void viewBalance() {
	        System.out.println("Savings Account Balance: ₹" + balance);
	    }
}
