import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine();
		boolean flag = false;
		
		
			for(char ch : str.toCharArray()) {
				if(ch=='<') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					flag = true;
				}
				
				else if(ch=='>') {
					flag = false;
					sb.append(ch);
					continue;
				}
				
				
				
				if(flag == true) {
					sb.append(ch);
				}
				else if(flag == false) {
					if(ch == ' ') {
						while(!stack.isEmpty()) {
							sb.append(stack.pop());
						}
						sb.append(' ');
						//continue;
					}
					else {
						stack.push(ch);
					}
				}
			}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
		System.out.println(sb);
	}

}
