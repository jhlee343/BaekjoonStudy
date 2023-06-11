
import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String c = sc.next();
		int total = 0;
		for(int i =0 ; i<num ; i++) {
			 total+=c.charAt(i)-'0';
		}
		System.out.println(total);
		sc.close();
	}
}