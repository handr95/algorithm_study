import org.junit.Test;

import array.ContainerWithMostWater;
import array.ContainerWithMostWaterSolution;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayTest {

    @Test
    public void container_with_most_water () {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertThat(containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7})).isEqualTo(49);
    }

    @Test
    public void container_with_most_water_solution () {
        ContainerWithMostWaterSolution containerWithMostWater = new ContainerWithMostWaterSolution();
        assertThat(containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7})).isEqualTo(49);
    }
}
