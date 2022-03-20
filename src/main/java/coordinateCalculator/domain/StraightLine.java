package coordinateCalculator.domain;

import coordinateCalculator.factory.CoordinateCalculator;
import coordinateCalculator.ui.InputView;
import coordinateCalculator.ui.ResultView;
import coordinateCalculator.util.StringUtil;

import java.io.IOException;

public class StraightLine extends CoordinateCalculator {
    public StraightLine() {
        this.points = new Points();
    }

    @Override
    public Double getCalculationResult(){

        int coordinateCount = points.getSize();

        if(coordinateCount == STRAIGHT_LINE){
            return points.getStraightLine();
        }

        throw new IllegalArgumentException("좌표의 개수를 확인해주세요");
    }

    public static void main(String[] args) throws IOException {
        StraightLine straightLine = new StraightLine();
        straightLine.addPoints(StringUtil.coordinatesSplit(InputView.inputCoordinate()));
        ResultView.straightLineResultMessage(straightLine.getCalculationResult());
    }
}