package src.perimeter;

public class RectanglePerimeter implements Perimeter {
    private int firstSide;
    private int secondSide;
    private int perimeter;

    public RectanglePerimeter(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void perimeter() {
        perimeter = 2 * (firstSide + secondSide);
        System.out.println("Rectangle perimeter = " + perimeter);
    }
}
