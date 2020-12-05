package src.perimeter;

public class CirclePerimeter implements Perimeter {
    private int radius;

    public CirclePerimeter(int radius) {
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        System.out.println("circle perimeter = " + (3.14 * 2 * radius));
    }
}
