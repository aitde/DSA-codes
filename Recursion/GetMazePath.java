import java.io.*;
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<String> ans = getMazePaths(0, 0, n-1, m-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if((sc+1) <= dc){
            ArrayList<String> partAns = getMazePaths(sr, sc+1, dr, dc);
        
        for(int i=0; i<partAns.size(); i++){
            ans.add('h' + partAns.get(i));
        }
        }
        
        if((sr+1) <=dr){
        ArrayList<String> partAns = getMazePaths(sr+1, sc, dr, dc);
        for(int i=0; i<partAns.size(); i++){
            ans.add('v' + partAns.get(i));
        }
        }
        return ans;
    }

}
