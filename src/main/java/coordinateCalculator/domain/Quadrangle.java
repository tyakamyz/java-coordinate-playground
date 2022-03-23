package coordinateCalculator.domain;

import coordinateCalculator.factory.CoordinateCalculator;
import coordinateCalculator.ui.InputView;
import coordinateCalculator.ui.ResultView;
import coordinateCalculator.util.StringUtil;

import java.io.IOException;

public class Quadrangle extends CoordinateCalculator {

    public Lines lines;

    public Quadrangle() {
        this.points = new Points();
        this.lines = new Lines();
    }

    @Override
    public Double getCalculationResult() {
        if(points.getSize() == QUADRANGLE_POINT_COUNT && lines.getLinesLength().size() == RECTANGLE_LINE_COUNT){
            return lines.getLinesLength().get(0) * lines.getLinesLength().get(1);
        }

        if(points.getSize() == QUADRANGLE_POINT_COUNT && lines.getLinesLength().size() == SQUARE_LINE_COUNT){
            return lines.getLinesLength().get(0) * lines.getLinesLength().get(0);
        }

        throw new IllegalArgumentException("좌표값이 올바르지 않습니다.");
    }

    public void setLinesToLinesLength(){
        lines.setLinesToLinesLength();
    }

    public void deduplicationLinesLength(){
        lines.deduplicationLinesLength();
    }

    public void createLines(){
        lines.addLine(new Line(points.get(0), points.get(1)));
        lines.addLine(new Line(points.get(1), points.get(2)));
        lines.addLine(new Line(points.get(2), points.get(3)));
        lines.addLine(new Line(points.get(3), points.get(0)));
    }

    public static void main(String[] args) throws IOException {
        Quadrangle quadrangle = new Quadrangle();
        quadrangle.addPoints(StringUtil.coordinatesSplit(InputView.inputCoordinate()));
        quadrangle.createLines();
        quadrangle.setLinesToLinesLength();
        quadrangle.deduplicationLinesLength();
        ResultView.quadrangleResultMessage(quadrangle.getCalculationResult());
    }
}