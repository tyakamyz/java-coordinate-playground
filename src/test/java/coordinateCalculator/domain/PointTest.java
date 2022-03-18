package coordinateCalculator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PointTest {

    @Test
    public void pointExceptionTest(){
        assertThatThrownBy(() -> new Point(25,1))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> new Point(1,25))
                .isInstanceOf(IllegalArgumentException.class);
    }

}