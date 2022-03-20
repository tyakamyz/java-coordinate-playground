package coordinateCalculator.domain;

import coordinateCalculator.factory.CoordinateCalculator;
import coordinateCalculator.ui.InputView;
import coordinateCalculator.ui.ResultView;
import coordinateCalculator.util.StringUtil;

import java.io.IOException;
import java.util.List;

public class StraightLine {
    public static void main(String[] args) throws IOException {
        CoordinateCalculator coordinateCalculator = CoordinateCalculator.create();
        coordinateCalculator.addPoints(StringUtil.coordinatesSplit(InputView.inputCoordinate()));
        ResultView.straightLineResultMessage(coordinateCalculator.getCalculationResult());
    }
}