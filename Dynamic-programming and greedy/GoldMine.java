import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int t = getAns(arr, i, 0, new int[n][m]);
            if (t > ans)
                ans = t;
        }

        System.out.println(ans);
        sc.close();
    }

    public static int getAns(int[][] arr, int sr, int sc, int[][] dp) {
        int n = arr.length - 1;
        int m = arr[0].length - 1;
        if (sr >= 0 && sr <= n && sc == m)
            return arr[sr][sc];

        if (sr < 0 || sc < 0 || sr > n || sc > m)
            return -1;

        if (dp[sr][sc] != 0)
            return dp[sr][sc];

        int d1 = getAns(arr, sr - 1, sc + 1, dp);
        int d2 = getAns(arr, sr, sc + 1, dp);
        int d3 = getAns(arr, sr + 1, sc + 1, dp);

        return dp[sr][sc] = arr[sr][sc] + Math.max(Math.max(d1, d2), d3);
    }
}
