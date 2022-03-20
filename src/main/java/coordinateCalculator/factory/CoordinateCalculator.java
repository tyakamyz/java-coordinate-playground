package coordinateCalculator.factory;

import coordinateCalculator.domain.Point;
import coordinateCalculator.domain.Points;

import java.util.List;

public class CoordinateCalculator {
    private final int STRAIGHT_LINE = 2;

    private final Points points;

    public CoordinateCalculator() {
        this.points = new Points();
    }

    public CoordinateCalculator create(){
        return new CoordinateCalculator();
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public void addPoints(List<String> coordinates){
        for(String coordinate : coordinates){
            points.add(coordinate);
        }
    }

    public Double getCalculationResult(){

        int coordinateCount = points.getSize();

        if(coordinateCount == STRAIGHT_LINE){
            return points.getStraightLine();
        }

        return null;
    }
}
