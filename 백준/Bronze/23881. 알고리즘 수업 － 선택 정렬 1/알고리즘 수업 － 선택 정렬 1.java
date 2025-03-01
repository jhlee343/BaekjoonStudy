import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int turn = sc.nextInt();
		
		int arr[] = new int[N];
		for(int i = 0 ; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr, turn, N);
	}
	
	public static void sort(int [] arr, int turn, int N) {
		int swap = 0;
		for(int i = N-1; i>0 ; i--) {
				int maxIndex = i;
				
				for(int j = 0 ; j<i ; j++) {
					if(arr[j]>arr[maxIndex]) {
						maxIndex = j;
					}
			}
				if(i !=maxIndex) {
					//swap
					int temp = arr[i];
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;
					swap++;
					
					if(turn ==swap) {
						System.out.println(Math.min(arr[i], arr[maxIndex]) +" "+ Math.max(arr[i], arr[maxIndex]));
						return;
					}

				}
		}
		System.out.println(-1);
		
	}

}
