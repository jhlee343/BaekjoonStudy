import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ary[] = new int[3];
		while(true) {
		for(int i =0 ; i<3 ;i++) {
			ary[i]=sc.nextInt();
		}
		if(ary[0]==0 && ary[1]==0 && ary[2]==0) {
			break;
			}		
		Arrays.sort(ary);
		int A = ary[0];
		int B = ary[1];
		int C = ary[2];

		if(A==B && B==C) {
			System.out.println("Equilateral");
			continue;
		}

		if(A+B>C) {
			if(A==B || B==C || A==C) {
				System.out.println("Isosceles");
				}
			else {
				System.out.println("Scalene");
				}
			}
		else {
			System.out.println("Invalid");
			}
	
		}
	}
}