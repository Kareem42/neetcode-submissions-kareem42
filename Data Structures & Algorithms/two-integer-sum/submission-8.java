class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create hashmap to store values and indexes of each element in the array 
       Map<Integer, Integer> indices = new HashMap<>();

        // Iterate through the length of nums and place those values in the hashmap
       for (int i = 0; i < nums.length; i++){
         indices.put(nums[i], i);
       }

        // Iterate through the length of nums again and compute the complement of the current element
       for (int i = 0; i < nums.length; i++){
        int diff = target - nums[i];
        // if it exists in the hashmap, return the indices of the current element and its component
        if (indices.containsKey(diff) && indices.get(diff) != i){
            return new int[]{i, indices.get(diff)};
            }
       }
       // if not, return an empty array
       return new int[0];

    }
}
