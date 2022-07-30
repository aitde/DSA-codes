import java.io.*;
import java.util.*;

public class PartitionIntoSubset {
        
    public static long partitionKSubset(int n, int k) {
        if(k==0) return 0;
        if(n==k) return 1;

        long ans=0;

        ans = k*partitionKSubset(n-1, k);
        ans += partitionKSubset(n-1, k-1);

        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}
