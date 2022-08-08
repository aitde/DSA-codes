import java.io.*;
import java.util.*;

public class PrintPermutation {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
        if(str.isEmpty()){
            System.out.println(asf);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            String temp = str.substring(0,i)+str.substring(i+1);
            printPermutations(temp, asf+str.charAt(i));
        }
    }

}
