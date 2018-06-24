package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/24.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
 */
public class IsValidSudoku {

    public static void main(String[] args) {
        char[][] b = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        isValidSudoku(b);
    }

    public static boolean isValidSudoku(char[][] board) {
        int rowNumber = board.length;
        if (rowNumber != 9) {
            return false;
        }
        int columnNumber = board[0].length;
        if (columnNumber != 9) {
            return false;
        }
        boolean[] exists;
        for (char[] aBoard : board) {
            exists = new boolean[9];
            for (int j = 0; j < columnNumber; j++) {
                if (aBoard[j] == '.') {
                    continue;
                }
                if (exists[aBoard[j] - '1']) {
                    return false;
                }
                exists[aBoard[j] - '1'] = true;
            }
        }
        for (int j = 0; j < columnNumber; j++) {
            exists = new boolean[9];
            for (int i = 0; i < rowNumber; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (exists[board[i][j] - '1']) {
                    return false;
                }
                exists[board[i][j] - '1'] = true;
            }
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                exists = new boolean[9];
                for (int i = 3 * r; i < 3 * r + 3; i++) {
                    for (int j = 3 * c; j < 3 * c + 3; j++) {
                        if (board[i][j] == '.') {
                            continue;
                        }
                        if (exists[board[i][j] - '1']) {
                            return false;
                        }
                        exists[board[i][j] - '1'] = true;
                    }
                }
            }
        }
        return true;
    }
}
