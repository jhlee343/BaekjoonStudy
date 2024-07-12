import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0 ;
		HashMap<String,Integer> map = new HashMap<>();
		HashMap<String,Integer> ans = new HashMap<>();
		
		for(int i = 0 ; i<N ; i++) {
			String Hear = sc.next();
			map.put(Hear, 0);
		}
		for(int j = 0 ; j<M ; j++) {
			String Look = sc.next();
			if(map.containsKey(Look)) {
				ans.put(Look, 0);
				count++;
			}
			
		}
		List<String> keySet = new ArrayList<>(ans.keySet());
		Collections.sort(keySet);
		System.out.println(count);
		for(String key : keySet) {
			System.out.println(key);
		}
		
				
	}

}
