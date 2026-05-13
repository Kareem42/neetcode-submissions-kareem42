class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Create an empty map to store the anagrams
        Map<String, List<String>> res = new HashMap<>();
        
        // 2. For loop used to loop through each character in the list
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            // Sort the characters of the string to form a key
            Arrays.sort(charArray);

            // Append the original string to the list corresponding to this key
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }

        // 3. Return the values of the hashmap
        return new ArrayList<>(res.values());
        }
        
}
