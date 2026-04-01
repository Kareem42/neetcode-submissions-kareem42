class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Initialize n to the length of nums array and create a res[] to store the results to the length of n
        int n = nums.length;
        int[] res = new int[n];
        
        // prefix: assume the first index in res to 1
        res[0] = 1;
        // calculate running product from left to right, storing left products
        for (int i = 1; i < n; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        // initialize postfix and set to 1
        int postfix = 1;
        // calculate running product from right to left, multiplying with the products to the left
        for (int i = n - 1; i >= 0; i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }
        // return res
        return res;
    }
}  
