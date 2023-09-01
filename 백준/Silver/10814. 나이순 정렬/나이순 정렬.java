import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<String>[] ary = new ArrayList[201];
		for(int i =0; i<201 ; i++) {
			ary[i]= new ArrayList<String>();
		}
		for(int i =0 ; i<num ; i++) {
			int age = sc.nextInt();
			ary[age].add(sc.next());
		}
		for(int j = 0 ; j<201 ; j++) {
			for(int i =0; i<ary[j].size(); i++) {
			System.out.println(j+" "+ary[j].get(i));
			}
		}
	}
}