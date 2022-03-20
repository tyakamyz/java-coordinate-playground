package coordinateCalculator.factory;

import coordinateCalculator.domain.Point;
import coordinateCalculator.domain.Points;

import java.util.List;

public abstract class CoordinateCalculator {
    public final int STRAIGHT_LINE = 2;
    public final int QUADRANGLE = 4;

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
