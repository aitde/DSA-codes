import java.io.*;
import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            if(ch == '(' || ch=='{' || ch=='['){
                stk.push(ch);
            }
            
            if(ch==']' || ch==')' || ch=='}'){
                
                if(stk.isEmpty()){
                    System.out.println(false);
                    return;
                }
                else if(ch==']' && stk.peek()!='['){
                    System.out.println(false);
                    return;
                }
                else if(ch=='}' && stk.peek()!='{'){
                    System.out.println(false);
                    return;
                }
                else if(ch==')' && stk.peek()!='('){
                    System.out.println(false);
                    return;
                }
                stk.pop();
            }
        }
        if(stk.isEmpty())
        System.out.println(true);
        else
        System.out.println(false);
    }

}
