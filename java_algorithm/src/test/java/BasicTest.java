import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;


public class BasicTest {

    @Test
    public void copyArray_test() {
         char arr1[] = {'1', '2', '3', '4', '5'};
         char arr2[] = {'A', 'B', 'C', 'D', 'E'};
         char expectArr[] = {'A', 'B', '3', 'D', 'E'};
         System.arraycopy(arr1, 2, arr2, 2, 1);


         assertThat(arr2, CoreMatchers.is(expectArr));
    }

    @Test
    public void copyArray_test2() {
        char arr1[] = {'1', '2', '3', '4', '5'};
        char arr2[] = new char[5];
        char expectArr[] = {'1', '2', '3', '4', '5'};
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);


        assertThat(arr2, CoreMatchers.is(expectArr));
    }
}
