package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 37. Sudoku Solver
 *
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 *
 * A sudoku solution must satisfy all of the following rules:
 *
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * Empty cells are indicated by the character '.'.
 *
 *
 * A sudoku puzzle...
 *
 *
 * ...and its solution numbers marked in red.
 *
 * Note:
 *
 * The given board contain only digits 1-9 and the character '.'.
 * You may assume that the given Sudoku puzzle will have a single unique solution.
 * The given board size is always 9x9.
 */
public class SudokuSolver {
    public void solveSudoku(char[][] board) {

    }

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<String>> heightMap = new HashMap<>();
        Map<Integer, List<String>> middleMap = new HashMap<>();
        Map<Integer, List<String>> widthMap = new HashMap<>();

        for (int i = 0; i < board.length; i ++) {
            heightMap.put(i , new ArrayList<>());
            middleMap.put(i , new ArrayList<>());
            widthMap.put(i , new ArrayList<>());
        }

        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board.length; j++) {
                if (String.valueOf(board[i][j]).equals(".")) {
                    continue;
                }
                if (heightMap.get(i).contains(String.valueOf(board[i][j]))) {
                    return false;
                } else {
                    heightMap.get(i).add(String.valueOf(board[i][j]));
                }

                if (middleMap.get(i/3 + (j/3)*3).contains(String.valueOf(board[i][j]))) {
                    return false;
                } else {
                    middleMap.get(i/3 + (j/3)*3).add(String.valueOf(board[i][j]));
                }

                if (widthMap.get(j).contains(String.valueOf(board[i][j]))) {
                    return false;
                } else {
                    widthMap.get(j).add(String.valueOf(board[i][j]));
                }
            }
        }

        return true;
    }
}
