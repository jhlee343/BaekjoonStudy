import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int arr[] = new int[total];
		for(int i =0; i<arr.length ; i++) {
			arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[total-1]);
		sc.close();
	}
}