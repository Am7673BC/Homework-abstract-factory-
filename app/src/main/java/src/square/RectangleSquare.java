package src.square;

public class RectangleSquare implements Square {
    private int firstSide;
    private int secondSide;
    private int square;

    public RectangleSquare(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void square() {
        this.square = firstSide * secondSide;
        System.out.println("Rectangle square = " + square);
    }
}
