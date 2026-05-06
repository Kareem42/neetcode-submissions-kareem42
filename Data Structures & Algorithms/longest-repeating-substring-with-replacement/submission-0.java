class Solution {
    public int characterReplacement(String s, int k) {
        // Initialize the pointers(l, r), max frequency, and result to 0.
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0;
        int maxf = 0;
        int res = 0;

        // Loop through the entire string
        for (int r = 0; r < s.length(); r++){
            // Update the frequency of the characters seen
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);

            // Update the maxf with the highest frequency thus far.
            maxf = Math.max(maxf, count.get(s.charAt(r)));

            // While the sliding window is valid.
            while ((r - l + 1) - maxf > k){
                // If not valid, shrink the sliding window from the left and adjust the count
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            // Update the result with the valid size of the window
            res = Math.max(res, r - l + 1);
        }
        // Return the result
        return res;
    }
}
