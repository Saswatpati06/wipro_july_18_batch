package Bank;

public class SavingsAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.04; 

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
