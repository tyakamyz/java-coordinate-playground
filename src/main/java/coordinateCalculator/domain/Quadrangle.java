package coordinateCalculator.domain;

import coordinateCalculator.factory.FigureFactory;
import coordinateCalculator.ui.InputView;
import coordinateCalculator.ui.ResultView;
import coordinateCalculator.util.StringUtil;

import java.io.IOException;
import java.util.List;

public class Quadrangle extends Figure {

    public Quadrangle(Points points) {
        this.points = points;
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

    @Override
    public void createLines(){
        lines.addLine(new Line(points.get(0), points.get(1)));
        lines.addLine(new Line(points.get(1), points.get(2)));
        lines.addLine(new Line(points.get(2), points.get(3)));
        lines.addLine(new Line(points.get(3), points.get(0)));
    }

    public static void main(String[] args) throws IOException {

        Points points = new Points();
        points.addPoints(StringUtil.coordinatesSplit(InputView.inputCoordinate()));

        Figure quadrangle = FigureFactory.getInstance(points);
        quadrangle.createLines();
        quadrangle.setLinesToLinesLength();
        quadrangle.deduplicationLinesLength();
        ResultView.quadrangleResultMessage(quadrangle.getCalculationResult());
    }
}