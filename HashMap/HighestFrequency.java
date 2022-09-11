import java.io.*;
import java.util.*;

public class HighestFrequency {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character,Integer> hm= new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int freq = hm.get(ch);
                hm.put(ch,freq+1);
            }
            else{
                hm.put(ch,1);
            }
        }

        int max = 0;
        char ans='a';

        for(Character ch : hm.keySet()){
            if(hm.get(ch)>max){
            max = hm.get(ch);
            ans = ch;
            }
        }

        System.out.println(ans);
    }

}