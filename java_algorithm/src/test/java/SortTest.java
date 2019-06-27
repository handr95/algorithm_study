import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import sort.ListSorter;

public class SortTest {

    @Test
    public void list_sort_merge() {
        ListSorter listSorter = new ListSorter();
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 1, 4, 2));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer elt1, Integer elt2) {
                return elt1.compareTo(elt2);
            }
        };

        System.out.println(list.toString());
        listSorter.insertionSort(list, comparator);
        System.out.println(list.toString());
    }
}
