
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int time = sc.nextInt();
		
		int spend = 60*H + M;
		spend = spend + time;
		
		H = (spend/60)%24;
		M = (spend %60);
		
			System.out.print(H);
			System.out.print(" ");
			System.out.println(M);

		
		sc.close();
	}
}