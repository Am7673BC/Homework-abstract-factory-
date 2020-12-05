package src.square;

public class QuadratSquare implements Square {
    private int firstSide;
    private int square;

    public QuadratSquare(int firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public void square() {
        this.square = firstSide * firstSide;
        System.out.println("Quadrat square = " + square);
    }
}
