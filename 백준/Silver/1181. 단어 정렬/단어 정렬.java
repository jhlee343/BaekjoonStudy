
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String ary[] = new String[num];
		
		for(int i =0; i<num; i++) {
			ary[i]= sc.next();
		}
		Arrays.sort(ary, new Comparator<String>(){
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length()-s2.length();
				}
			}
		});
		System.out.println(ary[0]);
		for(int i =1; i<num ; i++) {
			if(!ary[i].equals(ary[i-1])) {
				System.out.println(ary[i]);
			}
		}
	}
}