import java.util.Scanner;

public class CountEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] dp = new int[str.length() + 1];
        int ans = getCount(str, 0, dp);
        System.out.println(ans);
        sc.close();
    }

    public static int getCount(String str, int idx, int[] dp) {
        if (idx == str.length())
            return 1;

        if (str.charAt(idx) == '0')
            return 0;

        if (dp[idx] != 0)
            return dp[idx];

        int ans = 0;
        int first = str.charAt(idx) - '0';
        if (first > 0 && first <= 26) {
            ans += getCount(str, idx + 1, dp);
        }

        if (idx + 1 < str.length()) {
            int second = str.charAt(idx + 1) - '0';
            second = first * 10 + second;
            if (second < 27)
                ans += getCount(str, idx + 2, dp);
        }

        dp[idx] = ans;
        return ans;

    }

}
