
import java.util.*;

public class BuyAndSellStockInfinite {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max=0;
        int buy=arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }
            else{
                max += arr[i]-buy;
                buy = arr[i];
            }
        }
        System.out.println(max);
    }

}
