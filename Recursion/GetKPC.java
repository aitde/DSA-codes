import java.util.*;

public class GetKPC {

  public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    
    ArrayList<String> ans = getKPC(str);
    System.out.println(ans);
  }

  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
  
  public static ArrayList<String> getKPC(String str) {
    if(str.length()==0){
        ArrayList<String> al =new ArrayList<>();
        al.add("");
        return al;
    }
    
    ArrayList<String> ans = new ArrayList<>();
    int idx = str.charAt(0) - '0';
    String keys = codes[idx];
    
    ArrayList<String> al = getKPC(str.substring(1));
    
    for(int i=0; i<keys.length(); i++){
        for(int j=0; j<al.size(); j++){
            String comb = keys.charAt(i) + al.get(j);
            ans.add(comb);
        }
    }
    
    return ans;
  }

}
