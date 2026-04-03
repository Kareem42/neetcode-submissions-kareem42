class Solution {
    public boolean isValidSudoku(char[][] board) {
    // Create your three maps
    Map<Integer, Set> row = new HashMap<>();
    Map<Integer, Set> column = new HashMap<>();
    Map<Integer, Set> sub_boxes = new HashMap<>();

    // Loop through cells
    for (int c = 0; c < 9; c++){
        for(int r = 0; r < 9; r++){
            char cell = board[r][c];

            if (cell == '.'){
                continue;
            }
            // Check for duplicates
            int boxKey = (r / 3) * 3 + (c / 3);
            if (row.getOrDefault(r, new HashSet<>()).contains(cell)
            || column.getOrDefault(c, new HashSet<>()).contains(cell)
            || sub_boxes.getOrDefault(boxKey, new HashSet<>()).contains(cell)){
                return false;
            }

            // Add digits to sets
            row.computeIfAbsent(r, k -> new HashSet<>()).add(cell);
            column.computeIfAbsent(c, k -> new HashSet<>()).add(cell);
            sub_boxes.computeIfAbsent(boxKey, k -> new HashSet<>()).add(cell);
        }  
    }
    // Return true if no issues found
        return true;
    }
}
