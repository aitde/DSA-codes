import java.util.*;

public class ClimbVariableJump {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        
        int[] dp = new int[n+1];
        dp[n]=1;
        
        for(int i=n-1; i>=0; i--){
            int ans = 0;
            for(int j=1; j<=arr[i]; j++){
                if((i+j<=n) && arr[i]!=0){
                    ans += dp[i+j];
                }
            }
            dp[i] = ans;
        }
        
        
        System.out.println(dp[0]);
    }

}
