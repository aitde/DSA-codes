
import java.util.*;

public class UnboundedKnapSack {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] val = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int cap = sc.nextInt();
        int[][] dp = new int[n + 1][cap + 1];

        int ans = getAns(val, w, 0, 0, cap, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getAns(int[] val, int[] w, int idx, int ccap, int cap, int[][] dp) {
        if (idx == val.length) {
            if (ccap <= cap)
                return 0;

            return Integer.MIN_VALUE;
        }

        if (ccap > cap)
            return Integer.MIN_VALUE;

        if (dp[idx][ccap] != 0) {
            return dp[idx][ccap];
        }

        int a = val[idx] + getAns(val, w, idx, ccap + w[idx], cap, dp);
        int b = getAns(val, w, idx + 1, ccap, cap, dp);

        return dp[idx][ccap] = Math.max(a, b);
    }
}