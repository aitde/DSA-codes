import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int h = sc.nextInt();

        for (; l <= h; l++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= l; j++) {
                if ((l % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(l);
        }

        sc.close();
    }
}
