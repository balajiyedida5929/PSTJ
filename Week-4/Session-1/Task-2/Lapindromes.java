// Program
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
int T = sc.nextInt();

while (T-- > 0) {
    String s = sc.next();
    int[] a = new int[26];
    int[] b = new int[26];

    int mid = s.length() / 2;

    for (int i = 0; i < mid; i++)
        a[s.charAt(i) - 'a']++;

    for (int i = (s.length() + 1) / 2; i < s.length(); i++)
        b[s.charAt(i) - 'a']++;

    System.out.println(Arrays.equals(a, b) ? "YES" : "NO");
}

	}
}
Status :Successfully executed
Time:
0.0700 secs
Memory:
42.388 Mb
Sample Input
6
gaga
abcde
rotor
xyzxy
abbaab
ababc
Your Output
YES
NO
YES
YES
NO
NO
