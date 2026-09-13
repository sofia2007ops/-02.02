package practicum5;

public class Bouillon extends SoupBase {
    double meat;

    public Bouillon(SoupBase base, double meat) {
        super(base.water, base.salt);
        this.meat = meat;
    }

    public Bouillon(double water, double salt, double meat) {
        super(water, salt);
        this.meat = meat;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты бульона:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
    }
}
