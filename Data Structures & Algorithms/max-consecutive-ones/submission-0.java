class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // intialize the count and the result
        int res = 0;
        int count = 0;

        // Iterate through each element of the array
        for (int num : nums){
            // If element is 0, update the result with the max result and count
            if (num == 0){
                res = Math.max(res, count);
                count = 0;
                // Else, keep counting
            } else {
                count++;
            }
        }
        // Return the max of res and count
        return Math.max(res, count);
    }
}