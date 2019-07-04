import org.junit.Test;

import array.CircularPermutationCheck;
import array.DuplicationCheck;
import array.PermutationCheck;
import array.StringCompression;
import array.SubtractOne;
import array.URLConverter;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayTest {

    @Test
    public void duplication_check_test() {
        DuplicationCheck duplicationCheck = new DuplicationCheck();
        assertThat(duplicationCheck.duplicationCheck("aaaaaaaaaaaaaaaaaaaaaaaab")).isTrue();
        assertThat(duplicationCheck.duplicationCheck("abcdesqwerasdfshdf")).isFalse();
        assertThat(duplicationCheck.duplicationCheck("qwertyuioplkjgdsazxcv")).isFalse();
        assertThat(duplicationCheck.duplicationCheck("qazwsxedcrfvtgbyhnujm")).isFalse();
    }

    @Test
    public void permutaion_check() {
        PermutationCheck permutationCheck = new PermutationCheck();
        assertThat(permutationCheck.permutation_check("abcde", "edbac")).isTrue();
    }

    @Test
    public void url_converter_test() {
        URLConverter urlConverter = new URLConverter();
        assertThat(urlConverter.urlConverter("Mr John Smith")).isEqualTo("Mr%20John%20Smith");
    }

    @Test
    public void circular_permutation_check_test() {
        CircularPermutationCheck circularPermutationCheck = new CircularPermutationCheck();
        assertThat(circularPermutationCheck.circular_permutation_check("Tact Coa")).isTrue();
    }

    @Test
    public void subtract_one_test() {
        SubtractOne subtractOne = new SubtractOne();
        assertThat(subtractOne.subtract_one("pale", "ple")).isTrue();
        assertThat(subtractOne.subtract_one("pales", "pale")).isTrue();
        assertThat(subtractOne.subtract_one("pale", "bale")).isTrue();
        assertThat(subtractOne.subtract_one("pale", "plee")).isFalse();
    }

    @Test
    public void string_compression() {
        StringCompression stringCompression = new StringCompression();
        assertThat(stringCompression.string_compression("aabcccccaaa")).isEqualTo("a2b1c5a3");
        assertThat(stringCompression.string_compression("aa")).isEqualTo("a2");
        assertThat(stringCompression.string_compression("ab")).isEqualTo("a1b1");
        assertThat(stringCompression.string_compression("a")).isEqualTo("a1");
    }
}
