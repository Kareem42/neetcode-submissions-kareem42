class Solution {
    public int[] replaceElements(int[] arr) {
        // Set n to arr length
        int n = arr.length;
        // initialize the rMax to -1
        int rMax = -1;

        // Interate through the arr in reverse order
        for (int i = n - 1; i >= 0; i--){
            // Set the newMax to the max element in the array
            int newMax = Math.max(rMax, arr[i]);
            // Set the current index to be the rMax
            arr[i] = rMax;
            // Set the rMax as the newMax
            rMax = newMax;    
        }
        // Return the array
        return arr;
    }
}