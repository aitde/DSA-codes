import java.io.*;
import java.util.*;

public class DuplicateBrackets {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==')'){
                
                if(stk.peek()=='('){
                    System.out.println(true);
                    return;
                }
                
                while(stk.peek()!='('){
                    stk.pop();
                }
                stk.pop();
            }
            else{
                stk.push(str.charAt(i));
            }
        }
        System.out.println(false);
    }

}