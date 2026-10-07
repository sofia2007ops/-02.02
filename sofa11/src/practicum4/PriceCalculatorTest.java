package practicum4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        int price = priceCalculator.calculatePrice(TransportType.BIKE, 0);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        int price = priceCalculator.calculatePrice(TransportType.BIKE, 10);
        Assertions.assertEquals(100, price);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        int price = priceCalculator.calculatePrice(TransportType.BIKE, 21);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        int price = priceCalculator.calculatePrice(TransportType.CAR, 0);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        int price = priceCalculator.calculatePrice(TransportType.CAR, 1001);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn100ForCarAndDistanceIs1000Km() {
        // 1000 * 7 = 7000
        int price = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(7000, price);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        int price = priceCalculator.calculatePrice(TransportType.TRUCK, 0);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        // 1000 * 5 = 5000
        int price = priceCalculator.calculatePrice(TransportType.TRUCK, 1000);
        Assertions.assertEquals(5000, price);
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.DRONE, 0);
        Assertions.assertNull(price);
    }
}