package coordinateCalculator.factory;

import coordinateCalculator.domain.Points;

import java.util.List;

public class CoordinateCalculator {
    private final Points points;

    public CoordinateCalculator() {
        this.points = new Points();
    }

    public void addPoints(List<String> coordinates){
        for(String coordinate : coordinates){
            points.add(coordinate);
        }
    }
}
