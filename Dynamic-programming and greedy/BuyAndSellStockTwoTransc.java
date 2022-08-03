
import java.util.*;

public class BuyAndSellStockTwoTransc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // 0 - buy
        // 1 - sell

        int ans = getMax(arr, 2, 0, 1);
        System.out.println(ans);
    }
    static int getMax(int[] arr, int k, int idx, int state){
        if(idx==arr.length){
            if(state == 0){
                return -29877;
            }
            return 0;
        }

        int ans = 0;

        if(k > 0){
        if(state == 0){
            int sell = getMax(arr, k-1, idx+1, 1)+arr[idx];
            int rest = getMax(arr, k, idx+1, state);
            ans = Math.max(sell,rest);
        }
        else{
            int buy = getMax(arr, k, idx+1, 0)-arr[idx];
            int rest = getMax(arr, k, idx+1, state);
            ans = Math.max(buy,rest);
        }
    }
        return ans;
    }
}
