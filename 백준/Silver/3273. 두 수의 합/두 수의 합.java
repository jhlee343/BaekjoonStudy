import java.util.*;
import java.io.*;
public class Main {
	
	static int N, X, answer;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[N];
		
		HashSet<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0 ; i< N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		X = Integer.parseInt(br.readLine());
		
		for(int i =0 ; i<N ; i++) {
			if(set.contains(X-arr[i])) {
				answer++;
			}
		}
		System.out.println(answer/2);
		
	}

}
