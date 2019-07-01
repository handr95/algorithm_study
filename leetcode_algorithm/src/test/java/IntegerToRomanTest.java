import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerToRomanTest {

    @Test
    public void integer_to_roman_test() {
       IntegerToRoman integerToRoman = new IntegerToRoman();
        assertThat(integerToRoman.intToRoman(3)).isEqualTo("III");
       assertThat(integerToRoman.intToRoman(60)).isEqualTo("LX");
        assertThat(integerToRoman.intToRoman(40)).isEqualTo("XL");
    }
}
