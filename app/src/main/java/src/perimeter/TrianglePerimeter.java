package src.perimeter;

public class TrianglePerimeter implements Perimeter {
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private int perimeter;


    public TrianglePerimeter(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void perimeter() {
        this.perimeter = firstSide + secondSide + thirdSide;
        System.out.println("Triangle perimeter = " + perimeter);
    }
}
