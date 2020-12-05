package src;


import src.factory.GFactory;
import src.perimeter.Perimeter;
import src.square.Square;

public class Application {
    private Perimeter perimeter;
    private Square square;

    public Application(GFactory factory) {
        perimeter = factory.createPerimeter();
        square = factory.createSquare();
    }

    public void paint() {
        perimeter.perimeter();
        square.square();
    }


}
