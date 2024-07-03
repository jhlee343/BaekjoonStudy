import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer,Integer> hash = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N ; i++) {
			hash.put(Integer.parseInt(st.nextToken()), 0);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i =0 ; i<M ; i++) {
			if(hash.get(Integer.parseInt(st.nextToken())) != null) {
				sb.append("1 ");
			}
			else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
		
	}

}
