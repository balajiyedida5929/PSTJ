// Program:

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);

            totalSum += num;
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
nums =
[1,-2,3,-2]
Output
3
Expected
3
