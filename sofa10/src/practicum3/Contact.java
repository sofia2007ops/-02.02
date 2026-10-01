package practicum3;

// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно поле - имя пользователя name
    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Два абстрактных метода
    public abstract void sendMessage();
    public abstract void print();
}
