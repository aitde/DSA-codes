import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            boolean flag = false;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("not prime");
            else
                System.out.println("prime");
            t--;
            scn.close();
        }
    }
}
