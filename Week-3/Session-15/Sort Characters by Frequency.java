// Program
import java.util.Arrays;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        Character[] chars = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, (a, b) -> freq[b] - freq[a]);

        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }
}

Accepted
Runtime: 1 ms
Case 1
Case 2
Case 3
Input
s = "tree"
Output : "eetr"
Expected : "eert"
