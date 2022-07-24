import java.util.Scanner;

class CountBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = getCount(n - 1, 0) + getCount(n - 1, 1);
        System.out.println(ans);
        sc.close();
    }

    public static int getCount(int n, int val) {
        if (n == 0)
            return 1;

        int ans = 0;

        if (val == 0) {
            ans += getCount(n - 1, 1);
        } else {
            ans += getCount(n - 1, 0);
            ans += getCount(n - 1, 1);
        }
        return ans;
    }
}