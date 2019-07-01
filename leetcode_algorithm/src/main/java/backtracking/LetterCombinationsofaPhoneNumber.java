package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. Letter Combinations of a Phone Number (https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 *
 * Given a string containing digits from 2-9 inclusive,
 * inclusive : 폭넓은, 포괄적인, 포함하여
 * return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 *
 *
 *
 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order,
 * your answer could be in any order you want.
 */
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> letterMap = new HashMap<>();
        letterMap.put(2, "abc");
        letterMap.put(3, "def");
        letterMap.put(4, "ghi");
        letterMap.put(5, "jkl");
        letterMap.put(6, "mno");
        letterMap.put(7, "pqrs");
        letterMap.put(8, "tuv");
        letterMap.put(9, "wxyz");

        char[] digitsChar = digits.toCharArray();
        List<char[]> combinationLetters = new ArrayList<>();
        for (char digit : digitsChar) {
            Integer num = Integer.valueOf(digit);
            combinationLetters.add(letterMap.get(num).toCharArray());
        }

        for (char[] combinationLetter : combinationLetters) {

        }

        return null;
    }

    public String combinationLetter(char[] chars) {
        return String.valueOf(chars[0]);
    }
}
