import java.util.*;

public class ClimbStairs {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = stairs(n, new int[n + 1]);
        System.out.println(ans);
        sc.close();
    }

    public static int stairs(int n, int[] dp) {
        if (n == 1 || n == 0)
            return 1;
        if (n < 1)
            return 0;

        if (dp[n] != 0) {
            return dp[n];
        }

        int x = stairs(n - 1, dp);
        int y = stairs(n - 2, dp);
        int z = stairs(n - 3, dp);

        dp[n] = x + y + z;
        return dp[n];
    }
}
