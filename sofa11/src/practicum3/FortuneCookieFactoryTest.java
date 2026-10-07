package practicum3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieFactoryTest {
    private static FortuneCookieFactory factory;

    @BeforeEach
    public void beforeEach() {
        FortuneConfig config = new FortuneConfig(true);
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");
        factory = new FortuneCookieFactory(
                config,
                positive,
                negative
        );
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        // Исполнение
        factory.bakeFortuneCookie();

        // Проверка
        assertEquals(1, factory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        // Исполнение
        factory.bakeFortuneCookie();
        factory.bakeFortuneCookie();

        // Проверка
        assertEquals(2, factory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        // Подготовка: печём одну печеньку
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());

        // Исполнение
        factory.resetCookiesCreated();

        // Проверка
        assertEquals(0, factory.getCookiesBaked());
    }
}