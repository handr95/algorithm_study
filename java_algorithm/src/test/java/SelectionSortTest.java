import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.Test;
import selection_sort.SelectionSort;

import java.util.Arrays;

public class SelectionSortTest {

    @Test
    public void selection_sort() {
        int array[] = {4, 5, 6, 3, 7, 2};
        System.out.println("init: " + Arrays.toString(array));
        SelectionSort.selectionSort(array);
    }
}
