
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        getMazePaths(0, 0, n - 1, m - 1, "");
        System.out.println(ans);
        sc.close();
    }

    static ArrayList<String> ans = new ArrayList<>();

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void getMazePaths(int sr, int sc, int dr, int dc, String path) {
        if ((sr == dr) && (sc == dc)) {
            ans.add(path);
            return;
        }

        if (sr + 1 <= dr) {
            getMazePaths(sr + 1, sc, dr, dc, 'v' + path);
        }

        if (sc + 1 <= dc) {
            getMazePaths(sr, sc + 1, dr, dc, 'h' + path);
        }

    }

}