public class SavingsBank extends Bank {
    @Override
    protected BankAccount createAccount() {
        return new SavingsAccount();
    }
}
