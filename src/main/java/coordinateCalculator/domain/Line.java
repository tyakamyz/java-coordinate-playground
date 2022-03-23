package coordinateCalculator.domain;

import coordinateCalculator.factory.CoordinateCalculator;
import coordinateCalculator.ui.InputView;
import coordinateCalculator.ui.ResultView;
import coordinateCalculator.util.StringUtil;

import java.io.IOException;

public class Line extends CoordinateCalculator {
    public Line() {
        this.points = new Points();
    }

    public Line(Point pointA, Point pointB){
        this.points = new Points();
        points.add(pointA);
        points.add(pointB);
    }

    @Override
    public Double getCalculationResult(){

        int coordinateCount = points.getSize();

        if(coordinateCount == STRAIGHT_POINT_COUNT){
            return getStraightLine();
        }

        throw new IllegalArgumentException("좌표의 개수를 확인해주세요");
    }

    public double getStraightLine() {
        // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        Point pointA = points.get(0);
        Point pointB = points.get(1);
        return Math.sqrt(Math.pow(pointA.getPointX() - pointB.getPointX(),2) + Math.pow(pointA.getPointY() - pointB.getPointY(),2));
    }

    public static void main(String[] args) throws IOException {
        Line line = new Line();
        line.addPoints(StringUtil.coordinatesSplit(InputView.inputCoordinate()));
        ResultView.straightLineResultMessage(line.getCalculationResult());
    }
}