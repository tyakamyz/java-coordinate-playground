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

    public int getSize() {
        return points.size();
    }

    public double getStraightLine() {
        // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        Point pointA = points.get(0);
        Point pointB = points.get(1);
        return Math.sqrt(Math.pow(pointA.getPointX() - pointB.getPointX(),2) + Math.pow(pointA.getPointY() - pointB.getPointY(),2));
    }
}
