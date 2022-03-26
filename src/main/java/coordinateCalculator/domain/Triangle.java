package coordinateCalculator.domain;

import coordinateCalculator.factory.FigureFactory;
import coordinateCalculator.ui.InputView;
import coordinateCalculator.ui.ResultView;
import coordinateCalculator.util.StringUtil;

import java.io.IOException;
import java.util.List;

public class Triangle extends Figure {

    public Triangle(Points points) {
        this.points = points;
        this.lines = new Lines();
    }

    public Double getCalculationResult() {
        if(points.getSize() == TRIANGLE_POINT_COUNT){
            //헤론의 공식
            double s = (lines.getLinesLength().get(0) + lines.getLinesLength().get(1) + lines.getLinesLength().get(2))/2;
            return  Math.sqrt(s*((s-lines.getLinesLength().get(0)) * (s-lines.getLinesLength().get(1)) * (s-lines.getLinesLength().get(2))));
        }

        throw new IllegalArgumentException("좌표값이 올바르지 않습니다.");
    }

    public void setLinesToLinesLength(){
        lines.setLinesToLinesLength();
    }

    public void deduplicationLinesLength(){
        lines.deduplicationLinesLength();
    }

    @Override
    public void createLines(){
        lines.addLine(new Line(points.get(0), points.get(1)));
        lines.addLine(new Line(points.get(1), points.get(2)));
        lines.addLine(new Line(points.get(2), points.get(0)));
    }

    public static void main(String[] args) throws IOException {

        Points points = new Points();
        points.addPoints(StringUtil.coordinatesSplit(InputView.inputCoordinate()));

        Figure triangle = FigureFactory.getInstance(points);

        triangle.createLines();
        triangle.setLinesToLinesLength();
        triangle.deduplicationLinesLength();
        ResultView.triangleResultMessage(triangle.getCalculationResult());
    }
}