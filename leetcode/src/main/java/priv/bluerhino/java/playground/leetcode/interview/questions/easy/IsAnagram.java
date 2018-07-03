package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

import java.util.Arrays;

/**
 * Created by niekunlin @ 18/7/3.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/35/
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}
