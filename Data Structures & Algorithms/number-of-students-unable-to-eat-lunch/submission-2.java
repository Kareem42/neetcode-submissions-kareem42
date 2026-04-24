class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Set n to the length of the students arr
        int n = students.length;
        // Set the res to n 
        int res = n;
        // create a frequency count array and set it to hold 2 entries, one for students and one sandwiches
        int [] cnt = new int [2];

        // Loop through the length of students, which is n, increment the count of the students by 1 and add to the count array
        for (int i = 0; i < n; i++){
            cnt[students[i]]++;
        }
           // Loop through the length of sandwiches 
           for (int i = 0; i < n; i++){
            // if the count of the sandwiches is greater than 0, decrement the result by 1 and the count of sandwiches by 1
            if (cnt[sandwiches[i]] > 0){
                res--;
                cnt[sandwiches[i]]--;
            } else {
                // else break the loop if no student wants the sandwiches
                break;
            }
           }
           // return the res
        return res;
        }
    }