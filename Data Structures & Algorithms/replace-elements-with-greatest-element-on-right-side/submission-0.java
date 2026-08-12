class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int rMax = -1;

        for (int i = n - 1; i >= 0; i--){
            int newMax = Math.max(rMax, arr[i]);
            arr[i] = rMax;
            rMax = newMax;    
        }
        return arr;
    }
}