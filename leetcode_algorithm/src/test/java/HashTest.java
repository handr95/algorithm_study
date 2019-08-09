import hash.*;
import org.junit.Test;

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

    @Test
    public void valid_sudoku_test() {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        assertThat(validSudoku.isValidSudoku(board1)).isEqualTo(true);

        char[][] board2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        assertThat(validSudoku.isValidSudoku(board2)).isEqualTo(false);
    }

    @Test
    public void valid_sudoku_solution_test() {
        ValidSudokuSolution validSudoku = new ValidSudokuSolution();
        char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        assertThat(validSudoku.isValidSudoku(board1)).isEqualTo(true);

        char[][] board2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        assertThat(validSudoku.isValidSudoku(board2)).isEqualTo(false);
    }

    @Test
    public void reverse_linked_list() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNodeResult1 = new ListNode(5);
        ListNode listNodeResult2 = new ListNode(4);
        ListNode listNodeResult3 = new ListNode(3);
        ListNode listNodeResult4 = new ListNode(2);
        ListNode listNodeResult5 = new ListNode(1);
        listNodeResult1.next = listNodeResult2;
        listNodeResult2.next = listNodeResult3;
        listNodeResult3.next = listNodeResult4;
        listNodeResult4.next = listNodeResult5;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        assertThat(reverseLinkedList.reverseList(listNode1)).isEqualTo(listNodeResult1);
    }

    @Test
    public void group_anagrams_test(){
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
