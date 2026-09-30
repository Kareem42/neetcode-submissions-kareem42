class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hSet = new HashSet<>();
        
        for (int i : arr){
            hSet.add(i);
        }

        int count = 0;

        for (int i : arr){
            if (hSet.contains(i + 1)){
                count++;
            }
        }
        return count;
    }
}
