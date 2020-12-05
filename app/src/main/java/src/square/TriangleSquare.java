package src.square;

public class TriangleSquare implements Square {
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private int square;


    public TriangleSquare(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void square() {
        this.square = (int) Math.sqrt(((firstSide + secondSide + thirdSide) * ((firstSide + secondSide + thirdSide) / 2 * firstSide) * ((firstSide + secondSide + thirdSide) / 2 * secondSide) * ((firstSide + secondSide + thirdSide) / 2 * thirdSide)));
        System.out.println("Triangle src.square = " + square);
    }
}
