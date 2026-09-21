// Program
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> values = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            for (int i = left; i <= right; i++)
                values.add(matrix.get(top).get(i));

            for (int i = top + 1; i <= bottom; i++)
                values.add(matrix.get(i).get(right));

            for (int i = right - 1; i >= left; i--)
                values.add(matrix.get(bottom).get(i));

            for (int i = bottom - 1; i > top; i--)
                values.add(matrix.get(i).get(left));

            int len = values.size();
            int shift = r % len;

            int index = shift;

            for (int i = left; i <= right; i++) {
                matrix.get(top).set(i, values.get(index % len));
                index++;
            }

            for (int i = top + 1; i <= bottom; i++) {
                matrix.get(i).set(right, values.get(index % len));
                index++;
            }

            for (int i = right - 1; i >= left; i--) {
                matrix.get(bottom).set(i, values.get(index % len));
                index++;
            }

            for (int i = bottom - 1; i > top; i--) {
                matrix.get(i).set(left, values.get(index % len));
                index++;
            }
        }

        for (List<Integer> row : matrix) {
            System.out.println(
                row.stream()
                   .map(String::valueOf)
                   .collect(joining(" "))
            );
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput =
            bufferedReader.readLine().trim().split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            matrix.add(
                Arrays.stream(bufferedReader.readLine().trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList())
            );
        }

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
Input (stdin)
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Your Output (stdout)
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
Expected Output
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
