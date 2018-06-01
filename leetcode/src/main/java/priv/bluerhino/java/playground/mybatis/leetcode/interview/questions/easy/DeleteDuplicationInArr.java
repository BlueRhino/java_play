package priv.bluerhino.java.playground.mybatis.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/5/29.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
public class DeleteDuplicationInArr {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return 1;
        }
        // [1,1,2]
        int equalCount = 0, currentIndex = -1, backIndex = 0, frontIndex = 1;
        for (; frontIndex < length; frontIndex++) {
            if(nums[frontIndex] == nums[backIndex]){
                equalCount++;
            }
            else{
                currentIndex++;
                nums[currentIndex] = nums[backIndex];
                backIndex = frontIndex;
            }
        }
        currentIndex++;
        nums[currentIndex] = nums[backIndex];
        return length - equalCount;
    }

}
