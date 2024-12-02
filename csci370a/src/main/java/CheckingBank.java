public class CheckingBank extends Bank {
    @Override
    protected BankAccount createAccount() {
        return new CheckingAccount();
    }
}
