package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/21.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/29/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] n = new int[]{3, 2, 4};
        twoSum(n, 6);
    }



    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] res = null;
        if(length < 2){
            return res;
        }
        res = new int[2];
        int tmp;
        for(int i = 0 ; i < length - 1 ;i++){
            for(int j = i +1;j < length;j++){
                tmp = nums[i] + nums[j];
                if( tmp == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
