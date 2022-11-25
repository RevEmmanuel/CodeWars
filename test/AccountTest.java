import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account("Amila");
    }

    @Test
    void getName() {
        assertEquals("Amila", account.getName());
    }

    @Test
    void setName() {
        account.setName("Amala");
        assertEquals("Amala", account.getName());
    }
}