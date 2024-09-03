//1945. Sum of Digits of String After Convert
import java.util.*;


public class SumofDigitsofStringAfterConvert {
    public int getVal(char ch) {
        return ch - 'a' + 1;  
    }

    public int getLucky(String s, int k) {
        StringBuilder ans = new StringBuilder();
         
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ans.append(getVal(ch));
        }
      
        while (k-- > 0) {
            int sum = 0;
            for (int i = 0; i < ans.length(); i++) {
                sum += ans.charAt(i) - '0'; 
            }
            ans = new StringBuilder(String.valueOf(sum));  
        }
        
        return Integer.parseInt(ans.toString());  
    }
    public static void main(String[] args) {
        
    }
}
