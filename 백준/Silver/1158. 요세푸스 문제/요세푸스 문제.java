import java.util.*;
import java.io.*;
public class Main {
//원형큐 만들기//
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int point = sc.nextInt();
		
		for(int i =1 ; i< N+1 ; i++) {
			queue.add(i);
		}
	
		sb.append("<");
		while(queue.size()>=1) {	
			for(int i =0 ;i<point-1 ; i++) {
				queue.offer(queue.poll());
			}
			if(queue.size()==1) {
			sb.append(queue.remove());
			}
			else {
				sb.append(queue.remove()).append(", ");
			}
			
		}
		sb.append(">");
		System.out.println(sb);
	}

}
