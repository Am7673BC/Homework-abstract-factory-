package src.factory;

import src.perimeter.Perimeter;
import src.perimeter.TrianglePerimeter;
import src.square.Square;
import src.square.TriangleSquare;

public class TriangleFactory implements GFactory {
    private int firstSide;
    private int secondSide;
    private int thirdSide;


    public TriangleFactory(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    @Override
    public Perimeter createPerimeter() {
        return new TrianglePerimeter(firstSide, secondSide, thirdSide);
    }

    @Override
    public Square createSquare() {
        return new TriangleSquare(firstSide, secondSide, thirdSide);

    }
}
