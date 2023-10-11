
import java.util.*;
public class project8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int origin[] = new int[num];
		int sorted[] = new int[num];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0 ; i<num ;i++) {
			origin[i]=sorted[i]=sc.nextInt();
		
		}
		Arrays.sort(sorted);
		
		
		int rank=0;
		for(int k : sorted) {
			if(!(map.containsKey(k))) {
				map.put(k, rank);
				rank++;
			}
			
		}		
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {//
			int ranking = map.get(key);
			sb.append(ranking).append(" ");
		}
		System.out.println(sb);
	}
}
