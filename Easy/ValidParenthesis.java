 package DSA.Easy;
 import java.util.*;
//Leetcode:20. Valid Parentheses
public class ValidParenthesis {
    public static boolean isValid(String str) {
        Stack <Character> S = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                S.push(ch);
            }else{
                if(S.isEmpty()) return false;
                if( (ch == ')' && S.peek() == '(')
                  ||(ch == '}' && S.peek() == '{')
                  ||(ch == ']' && S.peek() == '[') ){
                    S.pop();
                  }else{
                    return false;
                  }

            }

        }

        return S.isEmpty();

    }
    public static void main(String[] args) {
        String str = "(){[]";
        System.out.println(isValid(str));
        
    }

     
}