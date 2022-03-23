package coordinateCalculator.ui;

public class ResultView {
    private static final String STRAIGHT_LINE_RESULT = "두 점 사이 거리는 ";
    private static final String QUADRANGLE_RESULT = "사각형 넓이는 ";
    private static final String TRIANGLE_RESULT = "삼각형 넓이는 ";

    public static void straightLineResultMessage(Double result){
        System.out.println(STRAIGHT_LINE_RESULT + result);
    }

    public static void quadrangleResultMessage(Double result) {
        System.out.println(QUADRANGLE_RESULT + result);
    }

    public static void triangleResultMessage(Double result) {
        System.out.println(TRIANGLE_RESULT + result);
    }
}
