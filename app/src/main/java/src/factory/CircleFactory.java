package src.factory;

import src.perimeter.CirclePerimeter;
import src.perimeter.Perimeter;
import src.square.CircleSquare;
import src.square.Square;

public class CircleFactory implements GFactory {
    private int radius;

    public CircleFactory(int radius) {
        this.radius = radius;
    }

    @Override
    public Perimeter createPerimeter() {
        return new CirclePerimeter(radius);
    }

    @Override
    public Square createSquare() {
        return new CircleSquare(radius);
    }
}
