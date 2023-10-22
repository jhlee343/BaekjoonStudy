import java.util.*;
import java.io.*;
public class editor {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		//처음 문자열 입력
		String str =  br.readLine();
		
		for(int i =0 ; i<str.length(); i++) {
			stack1.push(str.charAt(i));
		}
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i =0 ; i<N ; i++) {
			
			String edit =br.readLine();
			
			switch(edit.charAt(0)) {
			case 'L' :  
				if(stack1.empty()) {
					break;
				}else {
					stack2.push(stack1.pop());
					break;
				}
			case 'D' :
				if(stack2.empty()) {
					break;
				}else {
					stack1.push(stack2.pop());
					break;
				}
			case 'B' :
				if(stack1.empty()) {
					break;
				}else {
					stack1.pop();
					break;
				}
			case 'P' :
				stack1.push(edit.charAt(2));
				break;
			}
		}
	while(!stack1.empty()) {
		stack2.push(stack1.pop());
	}
	while(!stack2.empty()) {
		sb.append(stack2.pop());
	}
	System.out.println(sb);
	}
}

