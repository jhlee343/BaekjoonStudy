import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int size;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
				case "push_front" :	{			
					deque.addFirst(Integer.parseInt(st.nextToken()));
					break;
				}
				
				case "push_back" :{
					deque.addLast(Integer.parseInt(st.nextToken()));
					break;
				}
				
				case "pop_front" :{
					if(deque.isEmpty()) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(deque.pollFirst()).append('\n');
					}
					break;
				}
				
				case "pop_back" :{
					if(deque.isEmpty()) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(deque.pollLast()).append('\n');
					}
					break;
				}
					
				case "size" :{
					sb.append(deque.size()).append('\n');
					break;
				}
				
				case "empty" :{
					if(deque.isEmpty()) {
						sb.append(1).append('\n');
					}
					else {
						sb.append(0).append('\n');
					}
					break;
				}
					
				case "front" :{
					if(deque.isEmpty()) {
						sb.append(-1).append('\n');
					}
					else {
					sb.append(deque.peekFirst()).append('\n');
					}
					break;
				}
				
				case "back" :{
					if(deque.isEmpty()) {
						sb.append(-1).append('\n');
					}
					else {
					sb.append(deque.peekLast()).append('\n');
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
