package practicum5;

public class VegetarianSoup extends SoupBase {
    double vegetables;

    public VegetarianSoup(SoupBase base, double vegetables) {
        super(base.water, base.salt);
        this.vegetables = vegetables;
    }

    public VegetarianSoup(double water, double salt, double vegetables) {
        super(water, salt);
        this.vegetables = vegetables;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}
