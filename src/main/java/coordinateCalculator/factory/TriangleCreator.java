package coordinateCalculator.factory;

import coordinateCalculator.domain.*;

public class TriangleCreator implements FigureCreator {
    @Override
    public Figure create(Points points) {
        return new Triangle(points);
    }
}