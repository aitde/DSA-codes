import java.util.*;

public class GetStairPaths {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    ArrayList<String> ans = getStairPaths(n);
    System.out.println(ans);
  }

  public static ArrayList<String> getStairPaths(int n) {
    if(n == 0){
        ArrayList<String> al = new ArrayList<>();
        al.add("");
        return al;
    }
    
    ArrayList<String> ans = new ArrayList<>();
    
    for(int i=1; i<=3; i++){
        if((n-i)>=0){
            ArrayList<String> temp = getStairPaths(n-i);
            for(int j=0; j<temp.size(); j++){
            ans.add(i + temp.get(j));
        }
        }
        
    }
    
    return ans;
  }

}
