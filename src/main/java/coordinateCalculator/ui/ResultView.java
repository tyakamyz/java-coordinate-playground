package coordinateCalculator.ui;

public class ResultView {
    private static final String STRAIGHT_LINE_RESULT = "두 점 사이 거리는 ";

    public static void straightLineResultMessage(Double result){
        System.out.println(STRAIGHT_LINE_RESULT + result);
    }

}
