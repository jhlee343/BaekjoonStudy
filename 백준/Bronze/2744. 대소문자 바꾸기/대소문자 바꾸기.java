import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer = "";
		for(int i =0 ; i<str.length(); i++) {
			char a = str.charAt(i);
			if(Character.isUpperCase(a)) {
				answer += Character.toLowerCase(a);
			}
			else {
				answer+= Character.toUpperCase(a);
			}
		}
		System.out.println(answer);
	}

}
