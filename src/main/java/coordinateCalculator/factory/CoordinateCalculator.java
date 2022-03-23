package coordinateCalculator.factory;

import coordinateCalculator.domain.Point;
import coordinateCalculator.domain.Points;

import java.util.List;

public abstract class CoordinateCalculator {
    public final int STRAIGHT_POINT_COUNT = 2;
    public final int QUADRANGLE_POINT_COUNT = 4;
    public final int RECTANGLE_LINE_COUNT = 2;
    public final int SQUARE_LINE_COUNT = 1;

    public Points points;

    public void addPoint(Point point){
        points.add(point);
    }

    public void addPoints(List<String> coordinates){
        for(String coordinate : coordinates){
            points.add(coordinate);
        }
    }

    public abstract Double getCalculationResult();
}
