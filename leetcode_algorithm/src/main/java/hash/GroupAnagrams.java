package hash;

import java.util.*;

/**
 * 49. Group Anagrams
 *
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            if (map.get(String.valueOf(c)) == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(c), list);
            } else {
                map.get(String.valueOf(c)).add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
