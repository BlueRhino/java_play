package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/7/4.
 */
public class MyAtoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
    }

    public static int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int length = str.length();
        int sum = 0;
        int max = Integer.MAX_VALUE / 10;
        int isNegative = 1;
        int j = 0;
        while (j < length && str.charAt(j) == ' ') {
            j++;
        }
        if (j < length && str.charAt(j) == '+') {
            j++;
        } else if (j < length && str.charAt(j) == '-') {
            isNegative = -1;
            j++;
        }
        for (int i = j; i < length; i++) {
            char current = str.charAt(i);
            if (current >= '0' && current <= '9') {
                if (sum > max || (sum == max && (current - '0') > 7)) {
                    if (isNegative > 0) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
                sum = sum * 10 + (current - '0');
            } else {
                break;
            }
        }
        sum = sum * isNegative;
        return sum;
    }

}
