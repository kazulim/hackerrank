import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            System.out.println(calculate(N, K));
        }
        scan.close();
    }

    private static int calculate(int N, int K) {
        int result = 0;

        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {
                int current = A & B;
                if (current > result && current < K) {
                    result = current;
                }
            }
        }
        return result;
    }
}