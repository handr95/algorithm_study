import org.junit.Test;

import bit.BitwiseAndOfNumbersRange;
import bit.CountingBits;
import bit.CountingBitsSolution;
import bit.NumberOfBits;

import static org.assertj.core.api.Assertions.assertThat;

public class BitTest {

    @Test
    public void count_bits_test() {
        CountingBits countingBits = new CountingBits();
        assertThat(countingBits.countBits(2)).isEqualTo(new int[]{0, 1, 1});
        assertThat(countingBits.countBits(5)).isEqualTo(new int[]{0, 1, 1, 2, 1, 2});
        assertThat(countingBits.countBits(64)).isEqualTo(
            new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4,
                      4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1});
        assertThat(countingBits.countBits(127)).isEqualTo(
            new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4,
                      4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5,
                      4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7});
    }

    @Test
    public void count_bits_solution_test() {
        CountingBitsSolution countingBits = new CountingBitsSolution();
        assertThat(countingBits.countBits(2)).isEqualTo(new int[]{0, 1, 1});
        assertThat(countingBits.countBits(5)).isEqualTo(new int[]{0, 1, 1, 2, 1, 2});
        assertThat(countingBits.countBits(64)).isEqualTo(
            new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4,
                      4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1});
        assertThat(countingBits.countBits(127)).isEqualTo(
            new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4,
                      4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5,
                      4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7});
    }

    @Test
    public void number_of_bits_test() {
        NumberOfBits numberOfBits = new NumberOfBits();
        assertThat(numberOfBits.hammingWeight(00000000000000000000000000001011)).isEqualTo(3);
        assertThat(numberOfBits.hammingWeight(00000000000000000000000010000000)).isEqualTo(1);
        //assertThat(numberOfBits.hammingWeight(11111111111111111111111111111101)).isEqualTo(31);
    }

    @Test
    public void bitwise_and_of_number_range_test() {
        BitwiseAndOfNumbersRange bitwiseAndOfNumbersRange = new BitwiseAndOfNumbersRange();
        assertThat(bitwiseAndOfNumbersRange.rangeBitwiseAnd(5,7)).isEqualTo(4);
        assertThat(bitwiseAndOfNumbersRange.rangeBitwiseAnd(0,1)).isEqualTo(0);
        assertThat(bitwiseAndOfNumbersRange.rangeBitwiseAnd(20000,2147483647)).isEqualTo(0);


    }
}
