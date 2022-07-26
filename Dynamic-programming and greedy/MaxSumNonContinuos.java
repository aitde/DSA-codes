import java.util.Scanner;

public class MaxSumNonContinuos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][2];
        int maxSum = getMaxSum(arr, 0, 0, dp);
        System.out.println(maxSum);
        sc.close();
    }

    static int getMaxSum(int[] arr, int idx, int picked, int[][] dp) {
        if (idx == arr.length) {
            return 0;
        }

        if (dp[idx][picked] != 0)
            return dp[idx][picked];

        int ans = 0;

        if (picked == 0) {
            ans = arr[idx] + Math.max(ans, getMaxSum(arr, idx + 1, 1, dp));
            ans = Math.max(ans, getMaxSum(arr, idx + 1, 0, dp));
        } else {
            ans = Math.max(ans, getMaxSum(arr, idx + 1, 0, dp));
        }
        dp[idx][picked] = ans;
        return ans;
    }
}
