// Program
import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        
        LocalDate d = LocalDate.parse(date);
        
        return d.getDayOfYear();
    }
}
Accepted
Runtime: 4 ms
Case 1
Case 2
Input
date = "2019-01-09"
Output : 9
Expected : 9
