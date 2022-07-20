import java.util.*;

public class CoinChangeComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int amt = sc.nextInt();
        int[][] dp = new int[n + 1][amt + 1];

        int ans = getAns(arr, 0, 0, amt, dp);
        System.out.println(ans);
        sc.close();
    }

    public static int getAns(int[] arr, int idx, int sum, int amt, int[][] dp) {
        if (sum == amt)
            return 1;

        if (idx >= arr.length || sum > amt) {
            return 0;
        }

        if (dp[idx][sum] != 0) {
            return dp[idx][sum];
        }
        int ans = 0;

        if (arr[idx] != 0) {
            ans = getAns(arr, idx, sum + arr[idx], amt, dp);
        }

        ans += getAns(arr, idx + 1, sum, amt, dp);

        return dp[idx][sum] = ans;
    }
}