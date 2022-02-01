class Solution {
    public int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int overAllProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }
            int currentProfit = prices[i] - leastSoFar;
            if (overAllProfit < currentProfit) {
                overAllProfit = currentProfit;
            }
        }
        return overAllProfit;
    }
}