package src.perimeter;

public class QuadratPerimeter implements Perimeter {
    private int firstSide;
    private int perimeter;

    public QuadratPerimeter(int firstSide) {
        this.firstSide = firstSide;

    }

    @Override
    public void perimeter() {
        perimeter = firstSide * 4;
        System.out.println("Quadrat perimeter = " + perimeter);
    }
}
