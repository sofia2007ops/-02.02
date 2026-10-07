package practicum2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {
        // Подготовка
        BankAccount account = new BankAccount("a", "b");

        // Исполнение
        account.block();

        // Проверка
        assertTrue(account.isBlocked());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {
        // Подготовка
        BankAccount account = new BankAccount("Ivan", "Ivanov");
        String[] expected = {"Ivan", "Ivanov"};

        // Исполнение
        String[] result = account.getFullName();

        // Проверка
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {
        // Подготовка
        BankAccount account = new BankAccount("a", "b");

        // Исполнение
        String currency = account.getCurrency();

        // Проверка
        assertNull(currency);
    }
}