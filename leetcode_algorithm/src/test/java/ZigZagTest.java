import org.junit.Test;

import math.ZigZagConversion;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigZagTest {

    @Test
    public void zig_zag_conversion_test() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        assertThat(zigZagConversion.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
        assertThat(zigZagConversion.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
        assertThat(zigZagConversion.convert("AB", 1)).isEqualTo("AB");
    }

    @Test
    public void zig_zag_conversion_solution_test() {
        ZigZagConversionSolution zigZagConversion = new ZigZagConversionSolution();
        assertThat(zigZagConversion.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
        assertThat(zigZagConversion.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
        assertThat(zigZagConversion.convert("AB", 1)).isEqualTo("AB");
    }
}
