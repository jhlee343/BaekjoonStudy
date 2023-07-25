import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =2;
		int count = sc.nextInt();
		
		for(int i=0 ; i<count; i++) {
			a=(a-1)+a;
		}
		int ans = a*a;
		System.out.println(ans);
		sc.close();
	}
}