package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/7.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/32/
 */
public class ReverseString {
    public String reverseString(String s) {
        if(s == null){
            return s;
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        if(length == 1){
            return s;
        }
        int half = length / 2;
        char tmp;
        for (int i = 0; i < half; i++) {
            tmp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = tmp;
        }
        return new String(chars);
    }
}
