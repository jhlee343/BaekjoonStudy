import java.util.*;
import java.io.*;

public class Main {
	static int queue[] = new int[10001];
	static int last =0;
	static int first = 0;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i =0 ; i< N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop" :

				System.out.println(pop());
				break;
				
			case "size" :

				System.out.println(size());
				break;
				
			case "empty" :

				System.out.println(empty());
				break;
				
			case "front" :

				System.out.println(front());
				break;
				
			case "back" :

				System.out.println(back());
				break;
			}
		}

		
	}
	public static void push(int x) {
		queue[last] = x;
		last++;
	}
	
	public static int pop() {
		if(last-first ==0 ) {
			return -1;
		}else {
			int p = queue[first];
			first++;
			return p;
		}

	}
	
	public static int size() {
		return last-first;
	}
	
	public static int empty() {
		if(last-first == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static int front() {
		if(last-first ==0) {
			return -1;
		}
		else {
			int front = queue[first];
			return front;
		}
	}
	
	public static int back() {
		if(last-first ==0) {
			return -1;
		}else {
			int back = queue[last-1];
			return back;
		}
	}
		

}
