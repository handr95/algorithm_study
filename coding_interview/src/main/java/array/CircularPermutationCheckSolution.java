package array;

public class CircularPermutationCheckSolution {

    private boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    private boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return false;
    }

    /**
     * 각 문자에 숫자를 대응시킨다. a -> 0
     * @param c
     * @return
     */
    private int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getDirectionality(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    private int[] buildCharFrequencyTable(String phrase) {
        return new int[0];
    }
}
