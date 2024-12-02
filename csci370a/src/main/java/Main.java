public class Main {
    public static void main(String[] args) {
        Bank savingsBank = new SavingsBank();
        BankAccount savingsAccount = savingsBank.openAccount();

        Bank checkingBank = new CheckingBank();
        BankAccount checkingAccount = checkingBank.openAccount();
    }
}
