import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for(int i = 0 ; i<input.length(); i++){
            if(input.charAt(i)=='('){
                stack.push('(');
            }else if(input.charAt(i)==')'){
                stack.pop();
            }
            if(i>0){
                if(input.charAt(i)==')' && input.charAt(i-1)=='('){
                    answer +=stack.size();
                }
                else if(input.charAt(i-1)==')' && input.charAt(i)==')'){
                    answer++;        
                }
            }
        }
        System.out.println(answer);
    }
}