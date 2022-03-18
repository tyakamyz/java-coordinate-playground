package coordinateCalculator.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilTest {

    @Test
    public void coordinatesSplitTest(){
        assertThat(StringUtil.coordinatesSplit("(10,10)-(14,15)"))
                .isEqualTo(Arrays.asList("10,10","14,15"));
    }

    @Test
    public void coordinateValidateCheckTest(){
        assertThat(StringUtil.coordinateValidateCheck("10,10"))
                .isEqualTo(true);

        assertThat(StringUtil.coordinateValidateCheck("1,1"))
                .isEqualTo(true);

        assertThat(StringUtil.coordinateValidateCheck("10,"))
                .isEqualTo(false);

        assertThat(StringUtil.coordinateValidateCheck(",10"))
                .isEqualTo(false);

        assertThat(StringUtil.coordinateValidateCheck(","))
                .isEqualTo(false);

        assertThat(StringUtil.coordinateValidateCheck("1010"))
                .isEqualTo(false);
    }

}