class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Step 1; Sort nums in ascending order
        // Step 1: iterate through nums array starting from the 2nd index
        // Step 2: check to see if the current index matches the previous index
        // Step 3: If matches, return true
        // Step 4: Else, return false
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;

    }
}