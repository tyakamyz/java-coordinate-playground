package coordinateCalculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Points {
    private final List<Point> points;

    public Points() {
        this.points = new ArrayList<>();
    }

    public void add(String coordinate) {

        this.points.add(new Point(Integer.parseInt(coordinate.split(",")[0]), Integer.parseInt(coordinate.split(",")[1])));
    }


}
