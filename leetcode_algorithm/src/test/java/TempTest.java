import org.junit.Test;
import temp.PermutationCheck;

import static org.assertj.core.api.Assertions.assertThat;

public class TempTest {
    @Test
    public void permutaion_check() {
        PermutationCheck permutationCheck = new PermutationCheck();
        assertThat(permutationCheck.permutation_check("abcde", "edbac")).isTrue();
    }
}
