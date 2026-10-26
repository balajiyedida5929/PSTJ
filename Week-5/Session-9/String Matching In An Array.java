// Program:

import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
words =
["mass","as","hero","superhero"]
Output
["as","hero"]
Expected
["as","hero"]
