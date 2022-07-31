import java.util.*;

public class AllIndices {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int count) {
        if(idx == arr.length){
            int[] ans = new int[count];
            return ans;
        }
        
        int[] ans;
        
        if(arr[idx] == x){
            ans = allIndices(arr, x, idx+1, count+1);
        }
        else{
            ans = allIndices(arr, x, idx+1, count);
        }
        
        if(arr[idx] == x){
            ans[count] = idx;
        }
        
        return ans;
    }

}
