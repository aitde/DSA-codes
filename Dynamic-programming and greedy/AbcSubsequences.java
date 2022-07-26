import java.util.Scanner;

public class AbcSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 0 nothing
        // 1 -> a
        // 2 -> b
        // 3 -> c

        int[][] dp = new int[str.length() + 1][4];
        int ans = getCount(str, 0, 0, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getCount(String str, int idx, int prev, int[][] dp) {

        if (idx == str.length()) {
            if (prev == 3)
                return 1;
            else
                return 0;
        }

        if (dp[idx][prev] != 0)
            return dp[idx][prev];

        char ch = str.charAt(idx);
        int ans = 0;

        if (ch == 'a') {
            if (prev == 0 || prev == 1)
                ans += getCount(str, idx + 1, 1, dp);
        } else if (ch == 'b') {
            if (prev == 2 || prev == 1)
                ans += getCount(str, idx + 1, 2, dp);
        } else {
            if (prev == 2 || prev == 3)
                ans += getCount(str, idx + 1, 3, dp);
        }

        ans += getCount(str, idx + 1, prev, dp);
        dp[idx][prev] = ans;
        return ans;
    }
}
