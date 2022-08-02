
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // 0 -> sell
        // 1 -> buy
        // 2 -> rest

        int ans = getAns(arr, 0, 2);
        System.out.println(ans);
    }
    static int getAns(int[] arr,  int idx, int state){
        if(idx == arr.length){
            if(state == 1)
            return -200000;

            return 0;
        }

        int ans = 0;

        if(state == 0){
            ans = getAns(arr, idx+1, 2);
        }
        else if(state == 1){
            int rest = getAns(arr, idx+1, state);
            int sell = getAns(arr, idx+1, 0)+arr[idx];

            ans = Math.max(rest, sell);
        }
        else{
            int buy = getAns(arr, idx+1, 1)-arr[idx];
            int rest = getAns(arr, idx+1, 2);

            ans = Math.max(buy,rest);
        }
        return ans;
    }
}
