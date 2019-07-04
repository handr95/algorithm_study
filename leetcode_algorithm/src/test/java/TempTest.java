import org.junit.Test;
import temp.CircularPermutationCheck;
import temp.PermutationCheck;
import temp.URLConverter;

import static org.assertj.core.api.Assertions.assertThat;

public class TempTest {
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
