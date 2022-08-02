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

        int ans=0;
        int buy=price[0];
        int high = buy;

        for(int i=1; i<n; i++){
            int curr=price[i];

            if(curr > high){
                high = curr;
            }
            else{
                int profit = high-buy-fee;

                if(profit < 0){
                    buy = Math.min(buy, curr);
                    high = buy;
                    continue;
                }

                if(high-curr > fee){
                    ans += profit;
                    buy = curr;
                    high = buy;
                }
            }
        }

        if((high - buy - fee) > 0)
        ans += high - buy - fee;
        System.out.println(ans);        
    }

}
