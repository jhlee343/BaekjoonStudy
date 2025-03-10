import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int length = text.length();
		
		String arr[] = new String [length];
		
		arr[0] = text;
		for(int i = 1 ; i<length ; i++) {
			String a = text.substring(text.length()-i,text.length());
			arr[i] = a;
		}
		
//		for(int i = 0 ; i<length ; i++) {
//			System.out.println(arr[i]);
//		}
		Arrays.sort(arr);
		
		for(int i = 0 ; i<length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
