class Solution {
    public boolean isAnagram(String s, String t) {
        // compare the s length to t length
        if (s.length() != t.length()){
            return false;
        }
        // use HashMap to store characters and the frequency of said characters
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();


        // Loop through the characters of the strings
        for (int i = 0; i < s.length(); i++){
            // Put the characters in the map and increase the count for each map by 1
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        // returns true if the maps equals each other
        return countS.equals(countT);
    }
}
