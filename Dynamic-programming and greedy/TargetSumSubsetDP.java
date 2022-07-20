import java.util.*;

class TargetSumSubsetDP {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        int[][] dp = new int[n + 1][tar + 1];

        boolean ans = getAns(arr, 0, 0, tar, dp);
        System.out.println(ans);
        sc.close();
    }

    public static boolean getAns(int[] arr, int idx, int sum, int tar, int[][] dp) {
        if (idx == arr.length) {
            if (sum == tar)
                return true;
            else
                return false;
        }

        if (sum > tar || idx > arr.length) {
            return false;
        }

        // 1 -- true
        // 2 -- false
        // 0 -- default

        if (dp[idx][sum] == 1)
            return true;
        else if (dp[idx][sum] == 2)
            return false;

        boolean ans;
        ans = getAns(arr, idx + 1, sum + arr[idx], tar, dp);
        ans = ans || getAns(arr, idx + 1, sum, tar, dp);

        if (ans)
            dp[idx][sum] = 1;
        else
            dp[idx][sum] = 2;

        return ans;
    }

}