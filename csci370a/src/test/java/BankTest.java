import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    @Test
    public void createSavingsAccountTest() {
        Bank savingsBank = new SavingsBank();
        BankAccount account = savingsBank.openAccount();
        assertTrue(account instanceof SavingsAccount, "The account should be an instance of SavingsAccount.");
    }

    @Test
    public void createCheckingAccountTest() {
        Bank checkingBank = new CheckingBank();
        BankAccount account = checkingBank.openAccount();
        assertTrue(account instanceof CheckingAccount, "The account should be an instance of CheckingAccount.");
    }
}



