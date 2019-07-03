import org.junit.Test;

import array.DuplicationCheck;

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
}
