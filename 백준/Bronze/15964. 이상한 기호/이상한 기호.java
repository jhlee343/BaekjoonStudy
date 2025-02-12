import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		long answer = (a+b)*(a-b);
		System.out.println(answer);
		
		sc.close();
	}

}
