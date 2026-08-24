// Program
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
          
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            
            if (i >= m) {
                int old = arr[i - m];

                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.put(old, map.get(old) - 1);
                }
            }

            
            if (i >= m - 1) {
                maxUnique = Math.max(maxUnique, map.size());
            }
        }

        System.out.println(maxUnique);

        sc.close();
    }
}

Compiler Message
Success
Input (stdin)
6 3
5 3 5 2 3 2
Expected Output
3
