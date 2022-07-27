import java.util.Scanner;

public class TilingWith21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        int ans = getWays(n, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getWays(int n, int[] dp) {
        if (n == 0)
            return 1;

        if (dp[n] != 0)
            return dp[n];

        int ans = 0;

        if (n > 1) {
            ans += getWays(n - 1, dp);
            ans += getWays(n - 2, dp);
        } else {
            ans += getWays(n - 1, dp);
        }

        dp[n] = ans;
        return ans;
    }
}
