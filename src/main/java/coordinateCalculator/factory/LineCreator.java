package coordinateCalculator.factory;

import coordinateCalculator.domain.Figure;
import coordinateCalculator.domain.FigureCreator;
import coordinateCalculator.domain.Line;
import coordinateCalculator.domain.Points;

public class LineCreator implements FigureCreator {
    @Override
    public Figure create(Points points) {
        return new Line(points);
    }
}