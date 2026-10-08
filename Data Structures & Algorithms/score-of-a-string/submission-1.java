class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++){
            char current = s.charAt(i);
            char next = s.charAt(i + 1);

            score += Math.abs(current - next);
        }

        return score;
    }
}