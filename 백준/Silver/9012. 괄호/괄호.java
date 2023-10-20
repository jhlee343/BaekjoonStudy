import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N ; i++) {
			String vps = br.readLine();
			boolean ans = true;
		    Stack<Character> stack = new Stack<>();	
			for(int k =0; k<vps.length(); k++) {
				if(vps.charAt(k)=='(') {
					stack.push(vps.charAt(k));
				}
				else {
					if(stack.isEmpty()) {
						ans = false;
                        break;
					}
					else if(vps.charAt(0)==')') {
						ans=false;
					}
					else {
						stack.pop();
						
					}
				}
			}
			if(!stack.empty()) {
				ans=false;
			}
			if(ans==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		
		
	}

}
