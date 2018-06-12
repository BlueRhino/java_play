package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/12.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 */
public class Rotate2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }

    //矩阵对角线折叠后，第一列和最后一列互换，第二列和倒数第二列互换，以此类推
    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        int halfSize = n / 2;
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < n; j++) {
                tmp = matrix[j][i];
                matrix[j][i] = matrix[j][n - 1 - i ];
                matrix[j][n - 1 - i ] = tmp;
            }
        }
    }

    // 第二种思路，直接进行旋转，由于90度旋转，每次相关数只有4个
    private static void rotate2(int[][] matrix) {
        int n = matrix[0].length - 1;
        for (int i = 0; i <= n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = temp;
            }
        }
    }
}
