import java.util.*;
import java.io.*;
public class Main {
	static int stack[] = new int[10001];
	static int size;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for(int i =0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
			case "push":
				push(Integer.parseInt(st.nextToken()));

				break;
			case "pop":	
				sb.append(pop()).append("\n");
				break;
				
			case "size" :
				sb.append(size()).append("\n");
				break;
				
			case "empty" :
				sb.append(empty()).append("\n");
				break;
				
			case "top" :
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
	
	public static void push(int x) {
		stack[size]=x;
		size++;
	}
	
	public static int pop() {
		if(empty()==1) {
			return -1;
		}
		else {
			int pop = stack[size-1];
			size--;
			return pop;
		}
	}
	
	public static int empty() {
		if(size ==0) {
		return 1;
		}
	else {
		return 0;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int top() {
		if(size ==0) {
			return -1;
		}
		else {
			int top = stack[size-1];
			return top;
		}
	}
}
