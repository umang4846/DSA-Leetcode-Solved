class Solution {
    public int maxProfit(int[] prices) {
        int sellingDate = 0;
        int buyingDate = 0;
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] >= prices[i-1]){
                sellingDate++;
            }else{
                profit += prices[sellingDate] - prices[buyingDate];
                sellingDate = i;
                buyingDate = i;
            }
        }
        profit += prices[sellingDate] - prices[buyingDate];
        return profit;
    }
}