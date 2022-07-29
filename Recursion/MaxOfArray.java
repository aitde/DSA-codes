
import java.util.*;

public class MaxOfArray {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int ans =  maxOfArray(arr, 0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1)
        return arr[idx];
    
    int tAns =  maxOfArray(arr, idx+1);
    tAns = Math.max(tAns, arr[idx]);
    return tAns;
    }
}
