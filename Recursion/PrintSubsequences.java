
import java.util.*;

public class PrintSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        
        printSS(str.substring(1), ans+ch);
        printSS(str.substring(1), ans);
    }

}
