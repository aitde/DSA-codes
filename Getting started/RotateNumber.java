import java.util.*;
   
   public class RotateNumber {
   
   public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     
     int len = (int) ((Math.log10(n))+1);
     
     k = k % len;
     
     if(k<0){
        k = len + k;
     }
     
     int p =(int) Math.pow(10, k);
     int r = n%p;
     n = n/p;
     
     r = r* (int)(Math.pow(10, len-k));
     
     int ans = r + n;
     
     System.out.println(ans);
    }
   }
