package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

import java.util.Arrays;

/**
 * Created by niekunlin @ 18/6/12.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
 */
public class FindTwiceInt {
    // 思路一：排序后直接判断
    public static int singleNumber(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[length - 1];
    }

    // 思路二：使用异或
    public static int singleNumber2(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int res = 0;
        for (int i = 0; i < length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
