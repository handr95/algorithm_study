import org.junit.Test;

import hash.TwoSum;

import static org.assertj.core.api.Assertions.assertThat;

public class HashTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum(new int[]{3,2,3}, 6)).isEqualTo(new int[]{0, 2});
    }

}
