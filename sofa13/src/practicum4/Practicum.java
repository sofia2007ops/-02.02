package practicum4;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum пиццерия = new Practicum();
        пиццерия.openPizzeria();
        пиццерия.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // получаем текущее количество заказов клиента (или 0, если его ещё не было)
        int currentCount = orders.getOrDefault(clientName, 0);
        // записываем увеличенное значение
        orders.put(clientName, currentCount + 1);
    }

    private void printStatistics() {
        int totalOrders = 0;
        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            String client = entry.getKey();
            int count = entry.getValue();
            System.out.println("Заказов от " + client + ": " + count);
            totalOrders += count;
        }
        System.out.println("Всего заказов: " + totalOrders);
    }
}