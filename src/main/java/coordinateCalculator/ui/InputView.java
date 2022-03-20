package coordinateCalculator.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final String INPUT_COORDINATE = "좌표를 입력하세요.";

    /* 값 입력 */
    public static String inputCoordinate() throws IOException {
        System.out.println(INPUT_COORDINATE);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return br.readLine();
    }
}
