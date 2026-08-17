class Solution {
    public int largestUniqueNumber(int[] nums) {
        // Initialize result to store the answer.
        
        if (nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);

        int curIndex = nums.length - 1;
        // iterate through the array
        while (curIndex >= 0) {
            // check the unique value of the array. If none are found, return -1
            if (curIndex == 0 || nums[curIndex] != nums[curIndex - 1]){
                return nums[curIndex];
            }
            // Skip the duplicates
            while (curIndex > 0 && nums[curIndex] == nums[curIndex - 1]){
                curIndex--;
            }
            curIndex--;
    }
    return -1;
}
}