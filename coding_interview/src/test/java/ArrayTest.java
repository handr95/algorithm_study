import org.junit.Test;

import array.CircularPermutationCheck;
import array.DuplicationCheck;
import array.PermutationCheck;
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
}
