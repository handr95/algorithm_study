import math.ReverseInteger;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseIntegerTest {

    @Test
    public void reverseIntegerTest() {
        ReverseInteger reverseInteger = new ReverseInteger();

        assertThat(reverseInteger.reverse(123), is(321));
        assertThat(reverseInteger.reverse(-123), is(-321));
        assertThat(reverseInteger.reverse(120), is(21));
        assertThat(reverseInteger.reverse(0), is(0));
        assertThat(reverseInteger.reverse(901000), is(109));
        assertThat(reverseInteger.reverse(1534236469), is(0));
                                           //2147483647
    }
}
