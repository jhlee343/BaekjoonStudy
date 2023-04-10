import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>44) {
			M = M-45;
			System.out.print(H);
			System.out.print(" ");
			System.out.print(M);
		}
		else {
			M = 60-(45-M);
			if(H!=0) {
				H = H-1;
				System.out.print(H);
				System.out.print(" ");
				System.out.print(M);
				
			}
			else {
				H = 23;
				System.out.print(H);
				System.out.print(" ");
				System.out.print(M);
				
			}
		}
		sc.close();
	}
}