//Program:
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}

//Output:
Input:
nums = [2,5,1,3,4,7]
n = 3

Output:
[2,3,5,4,1,7]
