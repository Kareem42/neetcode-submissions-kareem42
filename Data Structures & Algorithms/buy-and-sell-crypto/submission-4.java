class Solution {
    public int maxProfit(int[] prices) {
        // Use a two pointer approach, setting the first pointer to the first index of the array
        int minBuy = prices[0];
        // Second pointer will be our result, which will be set to 0
        int result = 0;

        // Loop through the array of prices starting from index 1
        for (int i = 1; i < prices.length; i++){
            // Initialize a profit variable which will calculate the profit between the price in the array and the result pointer
            int profit = prices[i] - minBuy;
            
            // Update the max profit if the profit is better
            result = Math.max(result, profit);

            // Update the minimum price if there is a lower price
            minBuy = Math.min(minBuy, prices[i]);
        }
            // Return the result
                    return result;
        }
        
    }