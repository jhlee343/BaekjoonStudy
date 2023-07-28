
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int  first =1;
		int range = 2;
		if(num==1) {
			System.out.println(1);
		}
		else {
			while(range<=num) {
				range=range+(6*first);
				first++;
			}
			System.out.println(first);
		}
		sc.close();
		//1->6->12->18
	}
}