package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

/**
 * Created by niekunlin @ 18/6/3.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = new int[]{6,1,3,2,4,7};
        System.out.println(maxProfit(prices));
    }

    /***
     * 原则有上涨趋势就买入，有下降或持平趋势就卖出
    ***/
    private static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        int front = -1, current = 0, behind = 1;
        int frontPrice, currentPrice = 0, behindPrice;
        boolean buy = true;
        int buyPrice = 0;
        for (; behind < length; front++, current++, behind++) {
            if (front == -1) {
                frontPrice = Integer.MAX_VALUE;
            } else {
                frontPrice = prices[front];
            }
            currentPrice = prices[current];
            behindPrice = prices[behind];
            if (buy) {
                if (frontPrice >= currentPrice && currentPrice < behindPrice) {
                    buyPrice =  currentPrice;
                    buy = false;
                }
            }
            else{
                if (frontPrice < currentPrice && currentPrice >= behindPrice) {
                    maxProfit +=  (currentPrice  - buyPrice);
                    buyPrice = 0;
                    buy = true;
                }
            }

        }
        // 还有股票没卖
        if(!buy){
            maxProfit += (prices[length - 1] - buyPrice);
        }
        return maxProfit;
    }

}
