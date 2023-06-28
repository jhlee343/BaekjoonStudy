
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int [] arr = new int[26];
		int count = str.length();
		
		for(int i =0; i<count; i++) {
			int num = str.charAt(i)-'A';
			arr[num]+=1;
		}
		int max=0 ;
		char answer = '?';
		for(int i =0; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				 answer = (char)(i+'A');
			}else if(max == arr[i]){
				 answer = '?';
			}
		}
		System.out.println(answer);
		sc.close();
	}
}