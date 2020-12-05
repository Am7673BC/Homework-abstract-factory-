package src.factory;

import src.perimeter.Perimeter;
import src.perimeter.RectanglePerimeter;
import src.square.RectangleSquare;
import src.square.Square;

public class RectangleFactory implements GFactory {
    private int firstSide;
    private int secondSide;

    public RectangleFactory(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public Perimeter createPerimeter() {
        return new RectanglePerimeter(firstSide, secondSide);
    }

    @Override
    public Square createSquare() {
        return new RectangleSquare(firstSide, secondSide);
    }
}
