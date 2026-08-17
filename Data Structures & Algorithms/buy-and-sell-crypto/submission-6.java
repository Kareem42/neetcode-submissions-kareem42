class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int res = 0;

        for (int i : prices){
            res = Math.max(res, i - minBuy);
            minBuy = Math.min(minBuy, i);
        }
        return res;
    }
}
