class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++){
            int profit = prices[i] - minBuy;
            if (profit > ans){
                ans = profit;
            }
            minBuy = Math.min(minBuy, prices[i]);

        }
        return ans;
    }
}