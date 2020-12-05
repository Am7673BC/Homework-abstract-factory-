package src;

import src.factory.CircleFactory;
import src.factory.GFactory;
import src.factory.QuadratFactory;
import src.factory.RectangleFactory;
import src.factory.TriangleFactory;

public class DemoApplication {
    private static final String CIRCLE_PROPERTY = "Circle";


    public Application ConfigureApplication(String type, int frstS) {

        Application app;
        GFactory factory;
        if (type.equals(CIRCLE_PROPERTY)) {
            factory = (GFactory) new CircleFactory(frstS);

        } else {
            factory = (GFactory) new QuadratFactory(frstS);
        }
        app = new Application(factory);
        return app;
    }

    public Application ConfigureApplication(int frstS, int scndS) {

        Application app;
        GFactory factory;

        factory = (GFactory) new RectangleFactory(frstS, scndS);

        app = new Application(factory);
        return app;
    }

    public Application ConfigureApplication(int frstS, int scndS, int thrdS) {

        Application app;
        GFactory factory;

        factory = (GFactory) new TriangleFactory(frstS, scndS, thrdS);

        app = new Application(factory);
        return app;
    }
}

