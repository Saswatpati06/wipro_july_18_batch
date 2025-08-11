package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S235", 10000);
        savings.printBalance();
        System.out.println("Interest (Savings): ₹" + savings.calculateInterest());

        System.out.println();

        BankAccount fd = new FixedDepositAccount("FD900", 50000);
        fd.printBalance();
        System.out.println("Interest (Fixed Deposit): ₹" + fd.calculateInterest());
    }
}
