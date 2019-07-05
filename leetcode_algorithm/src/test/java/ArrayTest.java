import org.junit.Test;

import array.ContainerWithMostWater;
import array.ContainerWithMostWaterSolution;
import array.ProductOfArrayExceptSelf;
import binarysearch.IntersectionOfTwoArrays;

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

    @Test
    public void product_of_array_except_self () {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        assertThat(productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
        assertThat(productOfArrayExceptSelf.productExceptSelf(new int[]{0, 0})).isEqualTo(new int[]{0, 0});
        assertThat(productOfArrayExceptSelf.productExceptSelf(new int[]{0, 1})).isEqualTo(new int[]{1, 0});
        assertThat(productOfArrayExceptSelf.productExceptSelf(new int[]{0, 1, 3})).isEqualTo(new int[]{3, 0, 0});
    }

    @Test
    public void intersection_of_two_arrays () {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        assertThat(intersectionOfTwoArrays.intersection(new int[]{1,2,2,1}, new int[]{2,2})).contains(new int[]{2});
        assertThat(intersectionOfTwoArrays.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})).contains(new int[]{9,4});
    }
}
