package selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int indexLowest(int[] array, int start) {
        int lowidx = start;
        for (int i = start; i < array.length; i ++){
            if (array[i] < array[lowidx]) {
                lowidx = i;
            }
        }
        return lowidx;
    }

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            int swap = indexLowest(array, i);
            swapElements(array, i, swap);
            System.out.println( i + ": "+ Arrays.toString(array));
        }
    }
}
