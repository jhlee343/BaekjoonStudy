import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.empty()){
                    stack.push(s.charAt(i));
                    break;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return answer;
        }else{
            answer = false;
            return answer;
        }
        
    }
}