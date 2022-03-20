package coordinateCalculator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointsTest {

    @Test
    public void pointsExceptionTest(){
        assertThatThrownBy(() -> new Points().add("25"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void getStraightLineTest(){
        Points points = new Points();
        points.add(new Point(10, 10));
        points.add(new Point(14, 15));

        assertEquals(points.getStraightLine(), 6.403124, 0.001);
        assertThat(points.getStraightLine()).isEqualTo(6.403124, offset(0.00099));
    }
}