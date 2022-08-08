import java.io.*;
import java.util.*;

public class GetMazePathJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
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
        if((sr == dr)&&(sc == dc)){
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int hm=1; hm<=dc-sc; hm++){
            ArrayList<String> hpaths = getMazePaths(sr, sc+hm, dr, dc);
            
            for(String hpath: hpaths){
                ans.add("h"+hm+hpath);
            }
        }
        
        for(int vm=1; vm<=dr-sr; vm++){
            ArrayList<String> vpaths = getMazePaths(sr+vm, sc, dr, dc);
            
            for(String vpath: vpaths){
                ans.add("v"+vm+vpath);
            }
        }
        
        for(int dm=1; dm<=dr-sr && dm<=dc-sc; dm++){
            ArrayList<String> dpaths = getMazePaths(sr+dm, sc+dm, dr, dc);
            
            for(String dpath: dpaths){
                ans.add("d"+dm+dpath);
            }
        }
        return ans;
        
    }

}
