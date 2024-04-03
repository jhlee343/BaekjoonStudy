import java.util.*;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(br.readLine());
	Deque<Integer> deque = new ArrayDeque<>();
	StringTokenizer sta = new StringTokenizer(br.readLine());
	StringTokenizer stb = new StringTokenizer(br.readLine());
	for(int i =0 ; i<N ; i++) {
		int point = Integer.parseInt(sta.nextToken());
		int element = Integer.parseInt(stb.nextToken());
		if(point==0) {
			//0인경우 큐 큐는 앞에값 쓰지?
			deque.addLast(element);
		}
	}
	int Nc = Integer.parseInt(br.readLine());
	StringTokenizer stc = new StringTokenizer(br.readLine());
	for(int i =0 ; i<Nc ; i++ ) {
		deque.addFirst(Integer.parseInt(stc.nextToken()));
		sb.append(deque.pollLast()+" ");
		}
	System.out.println(sb);
	}

}
