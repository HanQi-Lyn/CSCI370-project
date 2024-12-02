public abstract class Bank {
    protected abstract BankAccount createAccount();

    public BankAccount openAccount() {
        BankAccount account = createAccount();
        account.accountType();
        return account;
    }
}
