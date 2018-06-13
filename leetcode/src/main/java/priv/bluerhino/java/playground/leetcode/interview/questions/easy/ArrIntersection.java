package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

import java.util.Arrays;

/**
 * Created by niekunlin @ 18/6/13.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 */
public class ArrIntersection {

    public static void main(String[] args) {
        int[] a = new int[]{-2147483648, 1, 2, 3};
        int[] b = new int[]{1, -2147483648, -2147483648};
        intersect(a, b);
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        int[] longArr, shortArr;
        if (nums1.length > nums2.length) {
            longArr = nums1;
            shortArr = nums2;
        } else {
            longArr = nums2;
            shortArr = nums1;
        }
        int longLength = longArr.length, shortLength = shortArr.length;
        int[] res = new int[shortLength];
        int count = 0;
        Arrays.sort(longArr);
        Arrays.sort(shortArr);
        for (int i = 0, j = 0; (i < shortLength) & (j < longLength); ) {
            if (shortArr[i] == longArr[j]) {
                res[count] = shortArr[i];
                count++;
                i++;
                j++;
            } else if (shortArr[i] > longArr[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(res, count);
    }
}
