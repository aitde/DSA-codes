import java.util.Scanner;

class FriendsPairing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        int ans = getAns(n, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getAns(int n, int[] dp) {
        if (n < 0)
            return 0;

        if (n == 1 || n == 0)
            return 1;

        if (dp[n] != 0)
            return dp[n];

        int ans = 0;

        ans += 1 * getAns(n - 1, dp);
        ans += (n - 1) * getAns(n - 2, dp);

        dp[n] = ans;
        return ans;
    }
}