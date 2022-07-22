import java.util.Scanner;

public class ClimbStairMinMove {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = getAns(arr, 0, n, new int[n + 1]);
        System.out.println(ans);
        sc.close();

    }

    public static int getAns(int[] arr, int idx, int n, int[] dp) {
        if (idx == n)
            return 0;
        if (idx > n)
            return n + 1;

        if (dp[idx] != 0)
            return dp[idx];

        int ans = n + 1;

        for (int i = 1; i <= arr[idx]; i++) {
            ans = Math.min(ans, getAns(arr, idx + i, n, dp));
        }
        return dp[idx] = ans + 1;
    }
}
