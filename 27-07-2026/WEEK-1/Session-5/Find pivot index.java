// Program:
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        // Calculate total sum
        for (int num : nums) {
            total += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}


//Output:
Accepted
747 / 747 testcases passed
