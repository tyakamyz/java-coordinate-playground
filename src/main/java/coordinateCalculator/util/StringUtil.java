package coordinateCalculator.util;

import java.util.Arrays;
import java.util.List;

public class StringUtil {

    public static List<String> coordinatesSplit(String coordinates){
        return Arrays.asList(coordinates.replaceAll("\\(","").replaceAll("\\)", "").split("-"));
    }

    public static boolean coordinateValidateCheck(String coordinate){
        return coordinate.matches("[0-9]+,+[0-9]+");
    }
}
