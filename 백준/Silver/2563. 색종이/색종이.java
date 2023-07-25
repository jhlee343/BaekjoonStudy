import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int dup = 0;
		boolean [][] ary = new boolean [100][100];
		
		for(int i =0 ; i<count ; i++) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			for(int j=width ; j<width+10; j++) {
				for(int k = height; k<height+10; k++) {
					if(!ary[k][j]) {
						dup++;
						ary[k][j]=true;
					}
				
				}
			}
			
		}
        System.out.println(dup);
		sc.close();
	}
}