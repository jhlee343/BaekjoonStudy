import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	Stack<Integer> waiting = new Stack<>();
	Queue<Integer> line = new LinkedList<>();
	
	int N = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine());
	while(st.hasMoreTokens()) {
		// 5 4 1 3 2 입력
		line.add(Integer.parseInt(st.nextToken()));
	}
	
	int point = 1;
	while(!line.isEmpty()) {
		if(line.peek().equals(point)) {
			point++;
			line.remove();
			}
		else if(!waiting.isEmpty() && waiting.peek().equals(point)) {
			waiting.pop();
			point++;
		}
		else {
			waiting.add(line.remove());
			}
	}
			
	while(!waiting.isEmpty()) {
		if(waiting.peek().equals(point)) {
			waiting.pop();
			point ++;
		}else {
			System.out.println("Sad");
			break;
		}
	}
	if(point == N+1) {
		System.out.println("Nice");
	}
	}

}
