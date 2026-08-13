class Solution {
    public boolean validWordSquare(List<String> words) {
        // Iterate through words in the array
        for (int i = 0; i < words.size(); i++){
            for (int j = 0; j < words.get(i).length(); j++){
                // Check if the character of the row and characters of the col equals each other or if the characters of i doesn't equal the characters of j
                if (j >= words.size() || i >= words.get(j).length() || words.get(j).charAt(i) != words.get(i).charAt(j)) return false;    
            }      
    }
    // return true
            return true;
}
}