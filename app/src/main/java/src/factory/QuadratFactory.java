package src.factory;

import src.perimeter.Perimeter;
import src.perimeter.QuadratPerimeter;
import src.square.QuadratSquare;
import src.square.Square;

public class QuadratFactory implements GFactory {
    private int firstSide;

    public QuadratFactory(int firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public Perimeter createPerimeter() {
        return new QuadratPerimeter(firstSide);
    }

    @Override
    public Square createSquare() {
        return new QuadratSquare(firstSide);
    }
}
