import java.util.Scanner;

class PaintFence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][][] dp = new int[n + 1][k + 1][3];
        int ans = getWays(n, k, -1, 2, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getWays(int n, int k, int prevc, int count, int[][][] dp) {
        if (n == 0)
            return 1;

        if (prevc != -1 && dp[n][prevc][count] != 0)
            return dp[n][prevc][count];

        int ans = 0;

        for (int i = 0; i < k; i++) {
            if (i == prevc) {
                if (count < 2)
                    ans += getWays(n - 1, k, i, 2, dp);
            } else {
                ans += getWays(n - 1, k, i, 1, dp);
            }
        }
        if (prevc != -1)
            dp[n][prevc][count] = ans;
        return ans;
    }
}