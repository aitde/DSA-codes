import java.util.Scanner;

public class ArrangeBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n + 1][2];

        long ans = getCont(n - 1, 0, dp) + getCont(n - 1, 1, dp);
        System.out.println(ans * ans);
        sc.close();
    }

    public static long getCont(int n, int val, long[][] dp) {
        if (n == 0)
            return 1;

        if (dp[n][val] != 0)
            return dp[n][val];

        long ans = 0;

        if (val == 0) {
            ans += getCont(n - 1, 1, dp);
        } else {
            ans += getCont(n - 1, 0, dp);
            ans += getCont(n - 1, 1, dp);
        }

        dp[n][val] = ans;
        return ans;
    }

}
