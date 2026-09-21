// Program
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
nums =
[1,2,3,1]
Output
true
Expected
true
