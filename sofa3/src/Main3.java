import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Показать список всех животных в зоопарке.");
            System.out.println("2. Добавить животное в список.");
            System.out.println("3. Удалить животное из списка.");
            System.out.println("4. Очистить список.");
            System.out.println("5. Проверить, есть ли в зоопарке указанное животное.");
            System.out.println("0. Выйти.");
            System.out.print("Выберите команду: ");
            choice = in.nextInt();
            in.nextLine();

            if (choice == 1) {
                System.out.println("Список животных:");
                for (String animal : animals) {
                    System.out.println("- " + animal);
                }
                System.out.println("Всего животных: " + animals.size());
            }
            else if (choice == 2) {
                System.out.print("Введите животное: ");
                String newAnimal = in.nextLine();
                animals.add(newAnimal);
                System.out.println("Животное добавлено!");
            }
            else if (choice == 3) {
                if (!animals.isEmpty()) {
                    System.out.print("Введите животное для удаления: ");
                    String removeAnimal = in.nextLine();
                    if (animals.remove(removeAnimal)) {
                        System.out.println("Животное удалено!");
                    } else {
                        System.out.println("Такое животное не найдено.");
                    }
                } else {
                    System.out.println("Список пуст, удалять нечего.");
                }
            }
            else if (choice == 4) {
                if (!animals.isEmpty()) {
                    animals.clear();
                    System.out.println("Список очищен!");
                } else {
                    System.out.println("Список уже пуст.");
                }
            }
            else if (choice == 5) {
                System.out.print("Введите животное для поиска: ");
                String searchAnimal = in.nextLine();
                if (animals.contains(searchAnimal)) {
                    System.out.println("Да, это животное есть в зоопарке.");
                } else {
                    System.out.println("Нет, такого животного нет.");
                }
            }
            else if (choice == 0) {
                System.out.println("До свидания!");
            }
            else {
                System.out.println("Неверная команда.");
            }

        } while (choice != 0);
    }
}