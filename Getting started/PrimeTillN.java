import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h = scn.nextInt();

        for (; l <= h; l++) {
            boolean f = true;
            for (int j = 2; j * j <= l; j++) {
                if ((l % j) == 0) {
                    f = false;
                    break;
                }
            }
            if (f)
                System.out.println(l);
        }
        scn.close();
    }
}
