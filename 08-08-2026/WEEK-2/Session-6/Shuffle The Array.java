//Program:
import java.util.Arrays;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        return result;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] output = obj.shuffle(nums, n);
        System.out.println(Arrays.toString(output));
    }
}

//Output:
[2, 3, 5, 4, 1, 7]
