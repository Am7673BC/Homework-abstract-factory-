package src.factory;

import src.perimeter.Perimeter;
import src.square.Square;

public interface GFactory {
    Perimeter createPerimeter();

    Square createSquare();
}
