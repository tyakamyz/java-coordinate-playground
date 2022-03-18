package coordinateCalculator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PointsTest {

    @Test
    public void pointsExceptionTest(){
        assertThatThrownBy(() -> new Points().add("25"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}