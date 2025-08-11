package Java_labs_25_3_07;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account savings = new SavingsAccount(8000);
        bank.setAccount(savings);
        bank.operateAccount();

        System.out.println();

        Account current = new CurrentAccount(3000);
        bank.setAccount(current);
        bank.operateAccount();
    }
}
