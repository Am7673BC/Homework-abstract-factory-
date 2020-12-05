package src.square;

public class CircleSquare implements Square {
    private int radius;

    public CircleSquare(int radius) {
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println("Circle square = " + (3.14 * radius * radius));
    }
}
