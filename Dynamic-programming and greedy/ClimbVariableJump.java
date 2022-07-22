import java.util.Scanner;

public class ClimbVariableJump {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = Varjump(arr, 0, n, new int[n + 1]);
        System.out.println(ans);
        sc.close();
    }

    public static int Varjump(int[] arr, int i, int n, int[] dp) {
        if (i == n)
            return 1;
        if (i > n)
            return 0;

        if (dp[i] != 0) {
            return dp[i];
        }
        int sum = 0;

        for (int j = 1; j <= arr[i]; j++) {
            sum += Varjump(arr, i + j, n, dp);
        }
        dp[i] = sum;
        return dp[i];
    }
}
