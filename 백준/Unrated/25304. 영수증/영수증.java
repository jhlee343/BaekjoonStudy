
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count = sc.nextInt();
		int price = 0;
		for(int i = 0 ; i<count; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			price = price + (a*b);
		}
		if(total == price) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}