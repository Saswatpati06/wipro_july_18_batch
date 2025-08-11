package Bank;

public class FixedDepositAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.065; 

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
