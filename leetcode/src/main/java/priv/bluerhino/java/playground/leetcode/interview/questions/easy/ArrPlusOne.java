package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/13.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
public class ArrPlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean isCarry = true;
        int current;
        for (int i = length - 1; i >= 0; i--) {
            if (isCarry) {
                current = 1 + digits[i];
            } else {
                current =  digits[i];
            }
            if (current >= 10) {
                digits[i] = 0;
                isCarry = true;
            } else {
                digits[i] = current;
                isCarry = false;
            }
        }
        int[] res;
        if (isCarry) {
            res = new int[length + 1];
            System.arraycopy(digits, 0, res, 1, length);
            res[0] = 1;
        } else {
            res = digits;
        }
        return res;
    }
}
