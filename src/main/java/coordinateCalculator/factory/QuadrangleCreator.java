package coordinateCalculator.factory;

import coordinateCalculator.domain.*;

public class QuadrangleCreator implements FigureCreator {
    @Override
    public Figure create(Points points) {
        return new Quadrangle(points);
    }
}