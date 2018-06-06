package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by niekunlin @ 18/6/6.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
public class IntDuplicates {
    /**
     * 简单做法时间空间复杂度均未O(n)
     * Set映射方式可以优化，空间复杂度减小为O(k)，k为数组长度
     */
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return length != set.size();
    }
}
