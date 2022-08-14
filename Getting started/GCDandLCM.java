import java.util.*;
    
    public class GCDandLCM {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int hcf = getHCF(a, b);
      System.out.println(hcf);
      System.out.println((a*b)/hcf);
     }
     
    public static int getHCF(int a, int b){
        
        while(a!=0){
            
            int rem = b%a;
            b = a;
            a = rem;
            
        }
        return b;
    }
    }
