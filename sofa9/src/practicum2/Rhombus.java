package practicum2;

public class Rhombus extends Parallelogram {
    public Rhombus(double a, double h) {
        super(a, h);
    }

    @Override
    public double getArea() {
        return a * b; // где b — высота h
    }
}