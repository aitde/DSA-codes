import java.util.Scanner;

public class MinCostMaze {
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

        int ans = getAns(arr, 0, 0, n - 1, m - 1, new int[n][m]);
        System.out.println(ans);
        sc.close();
    }

    public static int getAns(int[][] arr, int sr, int sc, int dr, int dc, int[][] dp) {
        if (sr == dr && sc == dc)
            return arr[sr][sc];

        if (sr > dr || sc > dc)
            return 10001;

        if (dp[sr][sc] != 0)
            return dp[sr][sc];

        int ans = arr[sr][sc] + Math.min(getAns(arr, sr, sc + 1, dr, dc, dp), getAns(arr, sr + 1, sc, dr, dc, dp));
        return dp[sr][sc] = ans;
    }
}
