import java.util.*;

class FractionalKnapSacck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr[i][1] = scn.nextInt();
        }

        int totalweight = scn.nextInt();

        Arrays.sort(arr, (int[] a, int[] b) -> {
            double ratio1 = (a[0] * 1.0) / a[1];
            double ratio2 = (b[0] * 1.0) / b[1];

            if (ratio1 < ratio2)
                return -1;
            else
                return 1;
        });

        double ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i][1] <= totalweight) {
                ans += arr[i][0];
                totalweight -= arr[i][1];
            } else {
                double ratio = (arr[i][0] * 1.0) / arr[i][1];
                ans += ratio * totalweight;
                totalweight = 0;
                break;
            }
        }
        System.out.println(ans);
        scn.close();
    }

}