package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/5.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 */
public class RotateArr {

    public static void main(String[] args) {
        int[] source = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(source, 3);
    }

    /**
     * 首先整个数组翻转，后分部分翻转
     * TODO:翻转函数可以提取为公共函数
     */
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length <= 1 || k < 1) {
            return;
        }
        k = k % length;
        int half = length / 2;
        int tmp;
        for (int i = 0; i < half; i++) {
            tmp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - i - 1] = tmp;
        }
        half = k / 2;
        for (int i = 0; i < half; i++) {
            tmp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = tmp;
        }
        half = (length - k) / 2;
        for (int i = k; i < k + half; i++) {
            tmp = nums[i];
            nums[i] = nums[length - i - 1 + k];
            nums[length - i - 1 + k] = tmp;
        }
    }
}
