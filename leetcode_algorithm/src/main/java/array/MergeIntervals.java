package array;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int[][] temp = new int[intervals.length][2];
        int idx = 0;
        temp[0] = intervals[0];
        for (int i = 1; i < intervals.length; i ++) {
            if (temp[idx][1] >= intervals[i][0]) {
                temp[idx][1] = intervals[i][1];
            } else {
                idx ++;
                temp[idx][0] = intervals[i][0];
                temp[idx][1] = intervals[i][1];
            }
        }

        int [][] result = new int[idx + 1][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
