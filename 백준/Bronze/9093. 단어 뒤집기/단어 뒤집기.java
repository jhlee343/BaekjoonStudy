import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i =0 ; i<N ; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				sb.append(new StringBuilder(st.nextToken()).reverse().toString()).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
