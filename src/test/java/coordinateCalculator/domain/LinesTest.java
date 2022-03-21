package coordinateCalculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LinesTest {

    @DisplayName("중복 숫자 제거 테스트")
    @Test
    void deduplicationLinesLengthTest() {
        Lines lines = new Lines();
        lines.addLinesLength(12.3);
        lines.addLinesLength(12.3);
        lines.addLinesLength(15.5);
        lines.addLinesLength(15.5);
        lines.deduplicationLinesLength();

        assertThat(lines.getLinesLength())
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(12.3,15.5));
    }
}