import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void getName() {
        Account account = new Account("Amila");
        assertEquals("Amila", account.getName());
    }

    @Test
    void setName() {
        Account account = new Account("Amila");
        account.setName("Amala");
        assertEquals("Amala", account.getName());
    }
}