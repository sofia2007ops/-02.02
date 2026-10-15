package practicum2;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) {
        // ключ — название задачи, значение — выполнена эта задача или еще нет
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());

        // очищаем список задач
        todos.clear();

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());
    }
}