import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer ab = new StringBuffer(a);
		StringBuffer bb = new StringBuffer(b);
		
		String areverse = ab.reverse().toString();
		String breverse = bb.reverse().toString();
		
		
		int intA = Integer.parseInt(areverse);
		int intB = Integer.parseInt(breverse);
		
		if(intA>intB) {
			System.out.println(intA);
		}
		else {
			System.out.println(intB);
		}
		sc.close();
	}
}