//Program
import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }
    PerformOperation isPrime() {
        return (a) -> {
            if (a < 2)
                return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }
    PerformOperation isPalindrome() {
        return (a) -> {
            int original = a;
            int rev = 0;
            while (a > 0) {
                rev = rev * 10 + a % 10;
                a /= 10;
            }
            return original == rev;
        };
    }
}
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyMath ob = new MyMath();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1)
                System.out.println(ob.checker(ob.isOdd(), num) ? "ODD" : "EVEN");
            else if (ch == 2)
                System.out.println(ob.checker(ob.isPrime(), num) ? "PRIME" : "COMPOSITE");
            else
                System.out.println(ob.checker(ob.isPalindrome(), num) ? "PALINDROME" : "NOT PALINDROME");
        }
    }
}



//Input (stdin):
5
1 4
2 5
3 898
1 3
2 12
    
//Expected Output:
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
