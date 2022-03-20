package coordinateCalculator.domain;

import coordinateCalculator.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {

    @Test
    public void getCalculationResultTest(){
        Line line = new Line();
        line.addPoints(StringUtil.coordinatesSplit("(10,10)-(14,15)"));

        assertEquals(line.getCalculationResult(), 6.403124, 0.001);
        assertThat(line.getCalculationResult()).isEqualTo(6.403124, offset(0.00099));
    }

}