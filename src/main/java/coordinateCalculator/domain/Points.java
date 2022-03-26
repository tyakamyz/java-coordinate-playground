package coordinateCalculator.domain;

import coordinateCalculator.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class Points {
    private final List<Point> points;

    public Points() {
        this.points = new ArrayList<>();
    }

    public void add(Point point) {
        this.points.add(point);
    }

    public void add(String coordinate) {
        if(!StringUtil.coordinateValidateCheck(coordinate)){
            throw new IllegalArgumentException("좌표가 올바르지 않습니다.");
        }

        this.points.add(new Point(Integer.parseInt(coordinate.split(",")[0]), Integer.parseInt(coordinate.split(",")[1])));
    }

    public void addPoints(List<String> coordinates){
        for(String coordinate : coordinates){
            add(coordinate);
        }
    }

    public int getSize() {
        return points.size();
    }

    public Point get(int i) {
        return points.get(i);
    }
}
