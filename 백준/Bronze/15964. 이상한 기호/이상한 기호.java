import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = (a+b)*(a-b);
		System.out.println(answer);
		
		sc.close();
	}

}
