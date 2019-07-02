import org.junit.Test;

import hash.AddTwoNumbers;
import hash.JewelsAndStones;
import hash.ListNode;
import hash.TwoSum;

import static org.assertj.core.api.Assertions.assertThat;

public class HashTest {

    @Test
    public void two_sum_test() {
        TwoSum twoSum = new TwoSum();
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSum(new int[]{3,2,3}, 6)).isEqualTo(new int[]{0, 2});
    }

    @Test
    public void add_two_numbers_test() {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(0);
        ListNode listNode9 = new ListNode(8);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode7.next = listNode8;
        listNode8.next = listNode9;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertThat(addTwoNumbers.addTwoNumbers(listNode1, listNode4)).isEqualTo(listNode7);
    }

    @Test
    public void jewels_and_stones_test() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        assertThat(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3);
        assertThat(jewelsAndStones.numJewelsInStones("z", "ZZ")).isEqualTo(0);
    }
}
