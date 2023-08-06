
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int aryX [] = new int[n];
		int aryY [] = new int[n];
		for(int i =0; i<n ; i++) {
				aryX[i]= sc.nextInt();
				aryY[i]= sc.nextInt();
		}
		Arrays.sort(aryX);
		Arrays.sort(aryY);
		
		
		int Xsum = aryX[n-1]-aryX[0];
		int ysum = aryY[n-1]-aryY[0];
		System.out.println(Xsum *ysum);

	}
}
