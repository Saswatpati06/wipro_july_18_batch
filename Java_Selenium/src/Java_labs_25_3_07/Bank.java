package Java_labs_25_3_07;
public class Bank {
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
        System.out.println("Account linked to bank.");
    }

    public void operateAccount() {
        if (account != null) {
            account.viewBalance();
            account.deposit(1000);
            account.withdraw(500);
            System.out.println("Interest: ₹" + account.calculateInterest());
            account.viewBalance();
        } else {
            System.out.println("No account is currently linked.");
        }
    }
}
