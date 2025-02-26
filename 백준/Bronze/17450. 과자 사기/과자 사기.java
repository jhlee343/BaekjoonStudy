import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = new double[3];
		String ans = "";
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<3 ; i++) {
			double price = sc.nextInt();
			double weigh = sc.nextInt();
			if(price*10>=5000) {
				double cost = (weigh*10)/(price*10-500);
				arr[i] = cost;
			}else {
				double cost = (weigh*10)/(price*10);
				arr[i] = cost;
			}
			
		}
		
		double max = arr[0];
		int index = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
		
		if(index ==0) {ans = "S";}
		else if(index == 1) {ans = "N";}
		else if(index == 2) {ans = "U";}
	
		System.out.println(ans);
	}
}
