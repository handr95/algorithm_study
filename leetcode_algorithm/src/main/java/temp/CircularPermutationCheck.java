package temp;

import java.util.HashMap;
import java.util.Map;

public class CircularPermutationCheck {
    public boolean circular_permutation_check(String a) {
        char[] chars = a.toCharArray();
        Map<String, Integer> integerMap = new HashMap<>();
        for (char c : chars) {
            if (c == ' ') {
                continue;
            }
            integerMap.put(String.valueOf(c).toUpperCase(), integerMap.getOrDefault(String.valueOf(c).toUpperCase(), 0) + 1 );
        }

        int i = a.length() % 2 == 0 ? 0 : 1;
        for (Integer value : integerMap.values()) {
            if (i < 0) {
                return false;
            }
            if (value % 2 == 1) {
                i --;
            }
        }

        return true;
    }
}
