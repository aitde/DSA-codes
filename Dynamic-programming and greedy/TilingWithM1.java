import java.util.Scanner;

public class TilingWithM1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dp = new int[n + 1];

        int ans = getWays(n, m, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getWays(int n, int m, int[] dp) {
        if (n == 0)
            return 1;

        if (dp[n] != 0)
            return dp[n];

        int ans = 0;

        if (n >= m) {
            ans += getWays(n - 1, m, dp);
            ans += getWays(n - m, m, dp);
        } else {
            ans += getWays(n - 1, m, dp);
        }

        dp[n] = ans;
        return ans;
    }
}
