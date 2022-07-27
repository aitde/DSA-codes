import java.util.Scanner;

class PaintHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n + 1][3];
        int ans = getAns(arr, 0, -1, dp);
        System.out.println(ans);
        sc.close();
    }

    static int getAns(int[][] arr, int row, int prev, int[][] dp) {
        if (row == arr.length) {
            return 0;
        }

        if (prev != -1 && dp[row][prev] != 0)
            return dp[row][prev];

        int ans = Integer.MAX_VALUE;

        for (int col = 0; col < 3; col++) {
            if (col != prev) {
                ans = Math.min(ans, arr[row][col] + getAns(arr, row + 1, col, dp));
            }
        }
        if (prev != -1)
            dp[row][prev] = ans;
        return ans;
    }
}