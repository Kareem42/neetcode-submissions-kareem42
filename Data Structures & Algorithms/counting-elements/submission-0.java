class Solution {
    public int countElements(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();

        for(int i : arr){
            hashSet.add(i);
        }

        int count = 0;
        for(int i : arr){
            if(hashSet.contains(i + 1)){
                count++;
            }
        }
        return count;
    }
}