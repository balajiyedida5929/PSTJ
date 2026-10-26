// Program:

import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        char[] map1 = new char[26];
        char[] map2 = new char[26];

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map1[w - 'a'] == 0 && map2[p - 'a'] == 0) {
                map1[w - 'a'] = p;
                map2[p - 'a'] = w;
            } else if (map1[w - 'a'] != p || map2[p - 'a'] != w) {
                return false;
            }
        }

        return true;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
words =
["abc","deq","mee","aqq","dkd","ccc"]
pattern =
"abb"
Output
["mee","aqq"]
Expected
["mee","aqq"]
