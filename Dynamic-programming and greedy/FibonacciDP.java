import java.util.*;

public class FibonacciDP {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fibDp(n, new int[n + 1]);
        System.out.println(ans);
        sc.close();
    }

    public static int fibDp(int n, int[] dp) {
        if (n == 0 || n == 1)
            return n;

        if (dp[n] != 0) {
            return dp[n];
        }

        int x = fibDp(n - 1, dp);
        int y = fibDp(n - 2, dp);

        dp[n] = x + y;
        return dp[n];
    }
}
