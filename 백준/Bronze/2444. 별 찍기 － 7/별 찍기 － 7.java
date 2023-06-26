import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i =1; i<=count ; i++) {
			for(int j=i; j<count ; j++) {
				System.out.print(" ");
			}
			
			int increase = 2*i -1;
			for(int j = 0 ; j<i*2-1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i =2 ; i<=count; i++) {
			for(int j =1; j<i ; j++) {
				System.out.print(" ");
			}
			int decrease= 2*count-(i*2-1);
			for(int k = decrease ; k>0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
