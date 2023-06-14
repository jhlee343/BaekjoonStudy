
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int total = 0;
		StringTokenizer tokens = new StringTokenizer(str, " ");
		System.out.println(tokens.countTokens());
	}
}