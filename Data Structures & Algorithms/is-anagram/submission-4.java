class Solution {
    public boolean isAnagram(String s, String t) {
        // compare the s length to t length
        if (s.length() != t.length()){
            return false;
        }
        // use HashMap to store characters that are the same
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();


        // Loop through the characters of the strings
        for (int i = 0; i < s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
