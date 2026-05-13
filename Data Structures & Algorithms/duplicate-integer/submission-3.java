class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Loop through of the array starting the index 1
        for (int i = 1; i < nums.length; i++){
            // Check if the current index has already appeared
            if (nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
}