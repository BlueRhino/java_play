package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/15.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 */
public class MoveZero {

    public static void main(String[] args) {
        int[] source = new int[]{0,1,0,3,12};
        moveZeroes(source);
    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        int currentZeroIndex = -1;
        for (int currentIndex = 0; currentIndex < length; currentIndex++) {
            if (currentZeroIndex == -1) {
                if (nums[currentIndex] == 0) {
                    currentZeroIndex = currentIndex;
                    continue;
                } else {
                    continue;
                }
            }
            if (nums[currentIndex] != 0) {
                nums[currentZeroIndex] = nums[currentIndex];
                nums[currentIndex] = 0;
                int j;
                for (j = currentZeroIndex; j < currentIndex; j++) {
                    if (nums[j] == 0) {
                        currentZeroIndex = j;
                        break;
                    }
                }
                if(j == currentIndex){
                    currentZeroIndex = j;
                }
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                ++j;
            }
        }
    }
}
