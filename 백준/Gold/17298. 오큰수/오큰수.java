import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i =0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0 ; i<N ; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
				arr[stack.pop()]=arr[i];
			}
			
			stack.push(i);
				
		}
		
		while(!stack.empty()) {
			
			arr[stack.pop()]=-1;
			
		}
		for(int i = 0 ; i<N ; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
	}

}
