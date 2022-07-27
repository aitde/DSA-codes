import java.util.Scanner;

class PaintFence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = getWays(n, k, -1, 2);
        System.out.println(ans);
        sc.close();
    }

    public static int getWays(int n, int k, int prevc, int count) {
        if (n == 0)
            return 1;

        int ans = 0;

        for (int i = 0; i < k; i++) {
            if (i == prevc) {
                if (count < 2)
                    ans += getWays(n - 1, k, i, 2);
            } else {
                ans += getWays(n - 1, k, i, 1);
            }
        }
        return ans;
    }
}