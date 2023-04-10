import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x==y && x==z) {
			System.out.println(10000+(z*1000));
		}
		else if(x!=y && x!=z && y!=z) {
			if(x>y) {
				if(x>z) {
					System.out.println(x*100);
				}
				else if(z>x) {
					System.out.println(z*100);
				}
			}
			else {
				if(y>z) {
					System.out.println(y*100);
				}
				else if(z>y) {
					System.out.println(z*100);
				}
		
			}
		}
		else {
			if(x==y || x==z){
				System.out.println(1000 + (x*100));
				}
			else {
				System.out.println(1000 + (y*100));
			}
		}
	}
}