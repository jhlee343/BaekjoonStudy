import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ary[] = new int[5];
		int total = 0;
		for(int i =0; i<5; i++) {
			ary[i]= sc.nextInt();
			total += ary[i];
		}
		Arrays.sort(ary);
		System.out.println((int)total/5);
		System.out.println(ary[2]);
		
	}
}