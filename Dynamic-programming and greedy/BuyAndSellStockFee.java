
import java.util.*;

public class BuyAndSellStockFee {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] price = new int[n];

        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        int fee = sc.nextInt();

        int max=0;
        int buy=price[0];
        int high = buy;

        for(int i=1; i<n; i++){
            if(price[i] < high){
                if((high - price[i]) > fee){
                    if(high - buy - fee > 0)
                    max += high - buy - fee;
                    buy = price[i];
                    high = price[i];
                }
                else{
                    if(buy > price[i]){
                    buy = price[i];
                    high = buy;
                    }
                }
            }
            else{
                high = price[i];
            }
        }

        if((high - buy - fee) > 0)
        max += high - buy - fee;
        System.out.println(max);        
    }

}