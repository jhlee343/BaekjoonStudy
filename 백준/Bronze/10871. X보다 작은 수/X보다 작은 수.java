
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int arr[] = new int[total];
		int num = sc.nextInt();
		
		for(int i = 0 ; i<total ; i++) {
			arr[i]= sc.nextInt();
		}
		for(int i =0 ; i<total ; i++) {
			if(arr[i]<num) {
				System.out.print(arr[i]+" ");
			}
		}
		
			sc.close();
	}
}