
import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count = sc.nextInt();
		for(int i =0 ; i<count ; i++) {
			String str = sc.next();
			int num = str.length();
			String first = String.valueOf(str.charAt(0));
			String end = String.valueOf(str.charAt(num-1));
			System.out.println(first + end);
		}
	}
}