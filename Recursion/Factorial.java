
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        if(n==1) return 1;

        return n*factorial(n-1);
    }

}
