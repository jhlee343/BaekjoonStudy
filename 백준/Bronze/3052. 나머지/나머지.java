
import java.util.*;
public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int ary[] = new int[10];
		int count = 0;
		for(int i=0; i<ary.length ; i++) {
			int num =sc.nextInt();
			ary[i]= num%42;
		}
		for(int i =0; i<ary.length ; i++) {
			int tmp =0;
			for(int j = i+1 ; j<ary.length; j++){
				if(ary[i]==ary[j]) {
					tmp++;
				}
			}
			if(tmp==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}