import org.junit.Test;

import binarysearch.FindFirstAndLastPosition;
import binarysearch.FindFirstAndLastPositionSolution;
import binarysearch.PeakIndexInAMountainArray;

import static org.assertj.core.api.Assertions.assertThat;

public class BinnarySearchTest {

    @Test
    public void find_first_and_last_position_test () {
        FindFirstAndLastPosition findFirstAndLastPosition = new FindFirstAndLastPosition();
        assertThat(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).isEqualTo(new int[]{3, 4});
        assertThat(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)).isEqualTo(new int[]{-1, -1});
    }

    @Test
    public void find_first_and_last_position_solution_test () {
        FindFirstAndLastPositionSolution findFirstAndLastPosition = new FindFirstAndLastPositionSolution();
        assertThat(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).isEqualTo(new int[]{3, 4});
        assertThat(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)).isEqualTo(new int[]{-1, -1});
        assertThat(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 7, 7, 8, 8, 10}, 8)).isEqualTo(new int[]{5, 6});
    }

    @Test
    public void peak_index_in_mountain_array_test () {
        PeakIndexInAMountainArray peakIndexInAMountainArray = new PeakIndexInAMountainArray();
        assertThat(peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 1, 0})).isEqualTo(1);
        assertThat(peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 2, 1, 0})).isEqualTo(1);
        assertThat(peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9, 8, 1, 0})).isEqualTo(8);
    }

    @Test
    public void peak_index_in_mountain_array_solution_test () {
        PeakIndexInAMountainArray peakIndexInAMountainArray = new PeakIndexInAMountainArray();
        assertThat(peakIndexInAMountainArray.peakIndexInMountainArray_solution(new int[]{0, 1, 0})).isEqualTo(1);
        assertThat(peakIndexInAMountainArray.peakIndexInMountainArray_solution(new int[]{0, 2, 1, 0})).isEqualTo(1);
        assertThat(peakIndexInAMountainArray.peakIndexInMountainArray_solution(new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9, 8, 1, 0})).isEqualTo(8);
    }
}
