package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/7/3.
 */
public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();
        int length = chars.length;
        int start = 0, end = length - 1;
        while (start < end) {
            if (Character.isLetter(chars[start]) || Character.isDigit(chars[start])) {
                if (Character.isLetter(chars[end]) || Character.isDigit(chars[end])) {
                    if (chars[start] != chars[end]) {
                        return false;
                    } else {
                        start++;
                        end--;
                    }
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        return true;
    }
}
