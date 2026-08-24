// Program:

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

Accepted
Runtime: 0 ms
Case 1
Case 2
Input
nums =
[1,1,2]
Output
[1,2]
Expected
[1,2]
