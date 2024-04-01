import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int atm[] = new int[N];
		int time = 0;
		int total = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k =0 ;
		while(st.hasMoreTokens()) {
			atm[k]=Integer.parseInt(st.nextToken());
			k++;
		}
//		for(int i =0 ; i<N ; i++) {
//			atm[i]=Integer.parseInt(br.readLine());
//		}
		Arrays.sort(atm);
		for(int i =0 ; i<N ; i++) {
			time += atm[i];
			total +=time;
		}
		System.out.println(total);
	}

}
