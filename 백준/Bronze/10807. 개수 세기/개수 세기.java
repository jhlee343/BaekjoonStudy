import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int arr[] = new int[total];
		int count=0;
		for(int i = 0; i<total; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		
		for(int i = 0 ; i<total; i++) {
			if(arr[i]== num) {
				count +=1;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
