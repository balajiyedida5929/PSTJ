// Program

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;

        if (s.size() < m) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        if (sum == d) {
            count++;
        }

        for (int i = m; i < s.size(); i++) {
            sum += s.get(i);
            sum -= s.get(i - m);

            if (sum == d) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        BufferedWriter bufferedWriter = new BufferedWriter(
            new OutputStreamWriter(System.out)
        );

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(
            bufferedReader.readLine().trim().split("\\s+")
        ).map(Integer::parseInt).collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().trim().split("\\s+");

        int d = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
// Output:

Input (stdin)
5
1 2 1 3 2
3 2
Your Output (stdout)
2
Expected Output
2
