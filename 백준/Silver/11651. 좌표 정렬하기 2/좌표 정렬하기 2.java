
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ary[][] = new int[num][2];
		int change[][] = new int[num][2];
		for(int i =0; i<num ; i++) {
			ary[i][0]=sc.nextInt();
			ary[i][1]=sc.nextInt();
		}
		for(int i =0; i<num ; i++) {
			int tmp = ary[i][1];
			change[i][0]=tmp;
			change[i][1]=ary[i][0];
		}
		Arrays.sort(change, (p1,p2)->{
			if(p1[0]==p2[0]) {
				return p1[1]-p2[1];
			}else {
				return p1[0]-p2[0];
			}
		});
		for(int i =0 ; i<num ; i++) {
			System.out.println(change[i][1]+" "+change[i][0]);
		}
	}
}