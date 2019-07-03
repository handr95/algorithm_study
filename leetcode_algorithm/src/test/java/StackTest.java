import org.junit.Test;

import stack.DailyTemperatures;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {

    @Test
    public void daily_temperatures_test() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        assertThat(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})).isEqualTo(new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    }
}
