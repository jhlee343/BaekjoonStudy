import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String prefix = br.readLine();
		double arr [] = new double[n];
		
		for(int i =0 ; i<arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		double result = 0;
		Stack<Double> stack = new Stack<>();
		
		for(int i = 0 ; i<prefix.length(); i++) {
			if(prefix.charAt(i)<='Z' && prefix.charAt(i)>='A') {
				stack.push(arr[prefix.charAt(i)-'A']);
			}else {
				
				if(!stack.isEmpty()) {
					double first = stack.pop();
					double end = stack.pop();
					switch(prefix.charAt(i)) {
						case '+':
							result = end+first;
							stack.push(result);
							break;
					
						case '-' :
							result = end-first ;
							stack.push(result);
							break;
					
						case '*' :
							result = end*first;
							stack.push(result);
							break;
					
						case '/' :
							result = end/first;
							stack.push(result);
							break;
					}
				}
			}
		}
		System.out.printf("%.2f", stack.pop());
		
		br.close();
	}

}
