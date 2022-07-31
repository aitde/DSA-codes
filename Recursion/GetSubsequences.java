import java.io.*;
import java.util.*;

public class GetSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        
        char ch = str.charAt(0);
        
        ArrayList<String> temp = gss(str.substring(1));
        ans.addAll(temp);
        
        for(int i=0; i<temp.size(); i++){
            String t = ch + temp.get(i);
            ans.add(t);
        }
        
        return ans;
    }

}
