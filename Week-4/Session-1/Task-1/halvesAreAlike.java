// Program
class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                if (i < mid) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return count == 0;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
s = "book"
Output
true
Expected
true
