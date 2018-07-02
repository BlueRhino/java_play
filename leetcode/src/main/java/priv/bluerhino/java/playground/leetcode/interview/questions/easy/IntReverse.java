package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/7/2.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/
 */
public class IntReverse {

    public static void main(String[] args) {
        reverse(123);
    }

    public static int reverse(int x) {
        if(x == 0){
            return 0;
        }
        int isPositive = 1;
        if(x < 0){
            isPositive = -1;
            x = (-1 * x);
        }
        int res = 0;
        int willReachMax = Integer.MAX_VALUE / 10;
        while(x > 0){
            if(res > willReachMax){
                return 0;
            }
            res = (res * 10) + (x % 10);
            x = x / 10;
        }
        if(res < 0 ){
            return 0;
        }
        else{
            return isPositive * res;
        }
    }
}
